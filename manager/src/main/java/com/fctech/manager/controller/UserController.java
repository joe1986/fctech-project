package com.fctech.manager.controller;

import com.fctech.manager.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/6/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public @ResponseBody User login(){
        User user = new User();
        user.setIdCard("430522198605242873");
        user.setUsernmae("zhouzhuanshu");
        user.setPassword("123456");
        return user;
    }

    @RequestMapping(value = "/signout",method = RequestMethod.GET)
    public ModelAndView signout(){

        return new ModelAndView("index");
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public ModelAndView index(){

        return new ModelAndView("index");
    }
}
