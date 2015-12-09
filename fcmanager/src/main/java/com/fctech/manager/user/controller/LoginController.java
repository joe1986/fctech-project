package com.fctech.manager.user.controller;

import com.fctech.manager.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/9/29.
 */
@Controller
@RequestMapping
public class LoginController extends BaseController{

    @RequestMapping(value = "/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(){
        return new ModelAndView("login");
    }

}
