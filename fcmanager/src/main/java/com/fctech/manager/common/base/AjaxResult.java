package com.fctech.manager.common.base;

import java.util.Objects;

/**
 * Created by joe on 15/6/24.
 */
public class AjaxResult {
    private boolean success = true;

    private String msg;

    private Object data;

    public AjaxResult(){

    }

    public AjaxResult(boolean isSuccess){
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
