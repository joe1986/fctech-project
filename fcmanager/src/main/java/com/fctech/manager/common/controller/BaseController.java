package com.fctech.manager.common.controller;

import com.fctech.manager.common.base.AjaxResult;
import com.fctech.manager.common.base.ErrorInfo;
import com.fctech.manager.common.exception.AppRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by joe on 15/6/23.
 */

public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected AjaxResult ajaxResult = new AjaxResult();

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
