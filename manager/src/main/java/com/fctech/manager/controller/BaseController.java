package com.fctech.manager.controller;

import com.fctech.manager.common.AjaxResult;
import com.fctech.manager.common.ErrorInfo;
import com.fctech.manager.common.exception.AppRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joe on 15/6/23.
 */
@Controller
@ControllerAdvice
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected AjaxResult ajaxResult = new AjaxResult();

    private static Map<String, String> map = new HashMap<String, String>();

    static {
        map.put("error", "error");
        map.put("500", "500");
        map.put("404", "404");
    }

    @RequestMapping(value = "/error/{type}", method = RequestMethod.GET)
    public ModelAndView dispatcher(HttpServletRequest request, HttpServletResponse response, @PathVariable String type) {
        String mPage = "/user/home";
        if (map.containsKey(type)) {
            mPage = map.get(type);
        }
        return new ModelAndView(mPage);
    }

    @ExceptionHandler(AppRuntimeException.class)
    public @ResponseBody AjaxResult handlerCustomException( AppRuntimeException ex ) {

        ajaxResult.setSuccess(false);
        ErrorInfo errorInfo = new ErrorInfo();
        // 记录日志
        logger.error(ex.getMessage(), ex);
        errorInfo.setErrorCode(ex.getError_code());
        errorInfo.setMessage(ex.getMessage());

        ajaxResult.setData(errorInfo);
        return ajaxResult;
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody AjaxResult handlerAllException( Exception ex) {
        ajaxResult.setSuccess(false);
        ErrorInfo errorInfo = new ErrorInfo();
        // 记录日志
        logger.error(ex.getMessage(), ex);
        AppRuntimeException appRuntimeException = new AppRuntimeException( ex ,null,null);
        errorInfo.setErrorCode(appRuntimeException.getError_code());
        errorInfo.setMessage(appRuntimeException.getMessage());
        ajaxResult.setData(errorInfo);
        return ajaxResult;
    }
}
