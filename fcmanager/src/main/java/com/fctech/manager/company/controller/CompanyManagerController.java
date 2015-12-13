package com.fctech.manager.company.controller;

import com.fctech.manager.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/10/4.
 */
@Controller
@RequestMapping(value = "company")
public class CompanyManagerController extends BaseController{

    @RequestMapping(value = "/list")
    public ModelAndView login(){
        return new ModelAndView("company/list");
    }

    @RequestMapping(value = "/add")
    public ModelAndView add(){
        return new ModelAndView("company/add");
    }

    @RequestMapping(value = "/detail")
    public ModelAndView detail(){
        return new ModelAndView("company/detail");
    }
}
