package com.fctech.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/6/11.
 */
@Controller("/user")
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        System.out.println("=======================================");
        return new ModelAndView("index");
    }
}
