package com.fctech.manager.common.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/10/4.
 */
@Controller
@RequestMapping
public class CommonController extends BaseController {
	Logger logger = org.slf4j.LoggerFactory.getLogger(CommonController.class);
	private static Map<String, String> map = new HashMap<String, String>();

	static {
		map.put("error", "/common/error");
		map.put("500", "/common/500");
		map.put("404", "/common/404");
	}

	@RequestMapping(value = "/error/{type}", method = RequestMethod.GET)
	public ModelAndView dispatcher(HttpServletRequest request,
			HttpServletResponse response, @PathVariable String type) {
		String mPage = "/user/home";
		if (map.containsKey(type)) {
			mPage = map.get(type);
		}
		return new ModelAndView(mPage);
	}

}
