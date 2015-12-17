package com.fctech.manager.common.base;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class HttpRequestUtil {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(HttpRequestUtil.class);

	private static final String NGINX_IP_HEADER = "X-Real-IP";
	private static final String NGINX_URL_HEADER = "X-Real-Url";

	public static HttpServletRequest getRequest() {
		if (RequestContextHolder.getRequestAttributes() == null) {
			return null;
		}
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
	}

	public static String getApplicationContextPath() {
		return getRequest().getServletContext().getRealPath("/");
	}

	public static String getParameter(String key) {
		return getRequest().getParameter(key);
	}

	/**
	 * 从request中抽取客户端ip(兼容nginx转发模式)
	 * 
	 * @param request
	 * @see #NGINX_IP_HEADER
	 * @return
	 */
	public static String getRequstIp() {
		String ip = getRequest().getHeader(NGINX_IP_HEADER);
		if (StringUtils.isBlank(ip)) {
			ip = getRequest().getRemoteAddr();
		}
		return ip;
	}

	/**
	 * 从request中抽取当前url(兼容nginx转发模式)
	 * 
	 * @param request
	 * @see #NGINX_URL_HEADER
	 * @return
	 */
	public static String getRemoteUrl() {
		HttpServletRequest request = getRequest();
		if (checkParamNull(request)) {
			return null;
		}
		String url = request.getHeader(NGINX_URL_HEADER);
		if (StringUtils.isEmpty(url)) {
			return request.getRequestURL().toString();
		} else {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("NGINX_URL_HEADER:" + url);
			}
			return url;
		}
	}

	private static boolean checkParamNull(Object... params) {
		for (Object param : params) {
			if (null == param) {
				LOGGER.error("Invalid Parameter.");
				return true;
			}
		}
		return false;
	}

}
