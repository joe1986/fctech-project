package com.fctech.manager.common.exception;

import org.springframework.context.MessageSource;

/**
 * Created by joe on 15/6/24.
 */
public class DaoException extends AppRuntimeException {
    public DaoException(String message){
        this(message,null);
    }

    public DaoException(String  message,Exception targetException){
        super(targetException,null,message);
    }

    public DaoException(Throwable targetException){
        super(targetException,null,null);
    }

    public DaoException(Throwable targetException, String errorCode, String message, Object... parameters) {
        super(targetException,errorCode, message, parameters);
    }

    public DaoException(Throwable targetException, MessageSource messageSource, String errorCode, String message, Object... parameters) {
        super(targetException,messageSource, errorCode, message, parameters);
    }
}
