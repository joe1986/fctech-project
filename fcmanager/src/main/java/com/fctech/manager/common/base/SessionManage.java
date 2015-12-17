package com.fctech.manager.common.base;

import javax.servlet.http.HttpSession;

public class SessionManage {

	public static final String ADMIN_SESSION_KEY = "admin_session";

	public static void setSessionAttribute(String key, Object obj) {
		getSession().setAttribute(key, obj);
	}

	public static HttpSession getSession() {
		return HttpRequestUtil.getRequest().getSession();
	}

	public static Object getSessionAttribute(String key) {
		return getSession().getAttribute(key);
	}

	public static SessionUser getSessionUser(String sessionKey) {
		return (SessionUser) getSession().getAttribute(sessionKey);
	}

	public static void setSessionUser(SessionUser sessionUser) {
		getSession().setAttribute(ADMIN_SESSION_KEY, sessionUser);
	}

	public static void loginOut(String userKey) {
		getSession().removeAttribute(userKey);
	}

}
