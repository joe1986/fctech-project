package com.fctech.manager.controller;

import com.fctech.manager.common.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by joe on 15/6/11.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

   /* @Resource
    protected UserService userService;*/

    @Autowired
    protected MessageSource messageSource;

/*    @RequestMapping(value = "/login/{type}")
    public @ResponseBody AjaxResult login(@PathVariable String type){
        AjaxResult ajaxResult = new AjaxResult();
        UserPO user = new UserPO();
        user.setIdcard("430522198605242873");
        user.setUsername("zhouzhuanshu");
        user.setPassword("123456");
        userService.doBusiness( Integer.valueOf( type ));
        ajaxResult.setMsg("");
        ajaxResult.setData(user);
        return ajaxResult;
    }*/

    @RequestMapping(value = "/signout")
    public ModelAndView signout(){

        return new ModelAndView("index");
    }

}
