package com.fctech.manager.business.controller;

import com.fctech.manager.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joe on 15/10/4.
 */
@Controller
@RequestMapping(value = "business")
public class ProjectManagerController extends BaseController{

    @RequestMapping(value = "/collectData")
    public ModelAndView login(){
        return new ModelAndView("business/collectData");
    }

    @RequestMapping(value = "/projectConfig")
    public ModelAndView add(){
        return new ModelAndView("business/projectConfig");
    }

    @RequestMapping(value = "/projectManager")
    public ModelAndView detail(){
        return new ModelAndView("business/projectManager");
    }
}
