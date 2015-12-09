package com.fctech.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/9/29.
 */
@Controller
@RequestMapping
public class LoginController {

    @RequestMapping(value = "/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
}
