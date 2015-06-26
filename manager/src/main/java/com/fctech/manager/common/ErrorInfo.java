package com.fctech.manager.common;

/**
 * Created by joe on 15/6/24.
 */
public class ErrorInfo {
    private String errorCode;

    private String message;

    public ErrorInfo(){

    }

    public ErrorInfo(String errorCode){
        this.errorCode = errorCode;
    }

    public ErrorInfo(String errorCode ,String message ){
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
