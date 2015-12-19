package com.fctech.manager.user.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fctech.manager.common.base.AjaxResult;
import com.fctech.manager.common.base.SessionManage;
import com.fctech.manager.common.controller.BaseController;
import com.fctech.manager.user.vo.UserInfoVO;
import com.fctech.manager.user.exception.UserException;
import com.fctech.manager.user.service.ILoginService;

/**
 * Created by joe on 15/9/29.
 */
@Controller
@RequestMapping
public class LoginController extends BaseController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(LoginController.class);

	@Resource
	private MessageSource messageSource;

	@Resource
	private ILoginService loginService;

	@RequestMapping(value = "/index")
	public ModelAndView index() {
		if (SessionManage.getSessionUser(SessionManage.ADMIN_SESSION_KEY) != null) {
			return home();
		} else {
			return new ModelAndView("login");
		}

	}

	@RequestMapping(value = "/login")
	public @ResponseBody AjaxResult login(UserInfoVO vo) {
		AjaxResult result = new AjaxResult();
		try {
			loginService.checkUserLogin(vo);
		} catch (UserException e) {
			result.setError(e.getErrorCode(), messageSource);
			LOGGER.warn(result.toJson());
		} catch (Exception e) {
			result.setError(UserException.SYSTEM_ERROR, messageSource);
			LOGGER.error(e.getMessage(), e);
		}

		return result;
	}

	@RequestMapping(value = "/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/logout")
	public ModelAndView logout() {
		SessionManage.loginOut(SessionManage.ADMIN_SESSION_KEY);
		return new ModelAndView("login");
	}

}
