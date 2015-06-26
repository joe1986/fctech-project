package com.fctech.manager.common.exception;

import com.alibaba.druid.util.StringUtils;
import com.fctech.manager.util.ConfigUtil;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;
import java.util.Objects;

/**
 * Created by joe on 15/6/24.
 */
public class AppRuntimeException extends RuntimeException {

    private MessageSource messageSource;

    private String defaultMessage;

    private static final String DEFAULT_ERROR_CODE = "0000";

    protected String error_code;

    protected String message;

    private Throwable targetException;

    /**
     * 获取单一默认文件消息内容
     */
    public AppRuntimeException() {
        this.error_code = DEFAULT_ERROR_CODE;
        this.message = getLocalMessage();
        System.out.println("－－－－－－－－－－AppRuntimeException()－－－－－－－－－－");
    }

    public AppRuntimeException(Throwable targetException, String errorCode, String message, Object... parameters) {
        this(errorCode, message, parameters);
        this.targetException = targetException;
    }


    public AppRuntimeException(String errorCode, String message, Object... parameters) {
        this.error_code = errorCode;
        if (StringUtils.isEmpty(message)) {
            message = getLocalMessage();
        }
        this.message = String.format("%s : %s.", errorCode,
                String.format(message, parameters));
    }

    /**
     * 获取全局扫描文件消息内容
     * @param targetException 异常实体
     * @param messageSource   全局扫描配置文件对象
     * @param errorCode       错误代码
     * @param message         自定义消息内容
     * @param parameters      自定义消息扩展参数（字符串格式化替换符号 如"%s : %s." ）
     *
     */
    public AppRuntimeException(Throwable targetException, MessageSource messageSource, String errorCode, String message, Object... parameters) {
        this(messageSource, errorCode, message, parameters);
        this.targetException = targetException;

    }

    public AppRuntimeException(MessageSource messageSource, String errorCode, String message, Object... parameters) {
        this.messageSource = messageSource;
        this.error_code = errorCode;
        if (StringUtils.isEmpty(message)) {
            message = getLocalMessage();
        }
        this.message = String.format("%s : %s.", errorCode,
                String.format(message, parameters));
    }


    protected String getLocalMessage() {
        if (messageSource == null) {
            return ConfigUtil.getLocalMessage(error_code);
        }
        return ConfigUtil.getLocalMessage(messageSource, error_code);
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getTargetException() {
        return targetException;
    }

    public void setTargetException(Throwable targetException) {
        this.targetException = targetException;
    }

    public static void main(String[] args) {

    }
}
