package com.fctech.manager.common.base;

import java.util.Locale;

import org.springframework.context.MessageSource;

import com.alibaba.fastjson.JSON;

/**
 * Created by joe on 15/6/24.
 */
public class AjaxResult {
	private boolean success = true;

	private String msg;

	private Object data;

	public AjaxResult() {

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

	public void setError(String errorCode, MessageSource messageSource,
			Object... params) {
		this.setSuccess(false);
		this.setMsg(messageSource.getMessage(errorCode, params,
				Locale.SIMPLIFIED_CHINESE));
	}

	public String toJson() {
		return JSON.toJSONString(this);
	}
}
