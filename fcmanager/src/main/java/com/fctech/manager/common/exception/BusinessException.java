package com.fctech.manager.common.exception;

import org.springframework.context.MessageSource;

/**
 * Created by joe on 15/6/24.
 */
public class BusinessException extends AppRuntimeException {


    public BusinessException(Throwable targetException){
        super(targetException,null,null);
    }

    public BusinessException(Throwable targetException, String errorCode, String message, Object... parameters) {
        super(targetException,errorCode, message, parameters);
    }

    public BusinessException(Throwable targetException, MessageSource messageSource, String errorCode, String message, Object... parameters) {
        super(targetException,messageSource, errorCode, message, parameters);
    }
}

