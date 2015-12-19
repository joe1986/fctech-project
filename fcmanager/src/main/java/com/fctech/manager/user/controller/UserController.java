package com.fctech.manager.user.controller;

import com.fctech.manager.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/10/4.
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController{

    @RequestMapping(value = "/list")
    public ModelAndView userList(){
        return new ModelAndView("user/list");
    }

    @RequestMapping(value = "/add")
    public ModelAndView addUser(){
        return new ModelAndView("user/add");
    }

    @RequestMapping(value = "/menu")
    public ModelAndView menuList(){
        return new ModelAndView("user/menu");
    }

    @RequestMapping(value = "/menuInfo")
    public ModelAndView menuInfo(){
        return new ModelAndView("user/menuInfo");
    }

    @RequestMapping(value = "/role")
    public ModelAndView roleList(){
        return new ModelAndView("user/role");
    }

    @RequestMapping(value = "/roleInfo")
    public ModelAndView roleInfo(){
        return new ModelAndView("user/roleInfo");
    }

    @RequestMapping(value = "/roleMenu")
    public ModelAndView roleMenu(){
        return new ModelAndView("user/roleAuthor");
    }

    @RequestMapping(value = "/authorMenu")
    public ModelAndView authorMenu(){
        return new ModelAndView("user/authorMenu");
    }

    @RequestMapping(value = "/roleAuthor")
    public ModelAndView roleAuthor(){
        return new ModelAndView("user/roleAuthor");
    }

    @RequestMapping(value = "/userRole")
    public ModelAndView userRole(){
        return new ModelAndView("user/userRole");
    }
}
