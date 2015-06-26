package com.fctech.manager.util;

import com.fctech.manager.common.exception.AppRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by joe on 15/6/24.
 */

/* spring4.14 需要java8新特新注解支持：java.lang.annotation.Repeatable
@PropertySource({"classpath:/i18n/error_zh_CN.properties","classpath:/i18n/message_zh_CN.properties"})

@PropertySource("file:${CONF_DIR}/application.properties")

@PropertySources({
        @PropertySource("default.properties"),
        @PropertySource(value = "file:${CONF_DIR}/optional-override.properties", ignoreResourceNotFound = true)
}
@PropertySources({
        @PropertySource("classpath:i18n/error_zh_CN.properties"),
        @PropertySource("classpath:i18n/message_zh_CN.properties")
})*/
@Configuration
public class ConfigUtil{
    private static Logger logger  = LoggerFactory.getLogger(ConfigUtil.class );

    public static String getLocalMessage(MessageSource messageSource, String key){
        return messageSource.getMessage(key,null,Locale.CHINESE);
    }

    public static String getLocalMessage(String key) {
        return getString("i18n/error_zh_CN.properties",key);
    }

    /**
     * 获取资源文件，及配置属性
     *
     * @param propertiesName
     * @param key
     * @return
     */
    public static String getString(String propertiesName, String key)  {
        InputStream in =  ConfigUtil.class.getClassLoader().getResourceAsStream( propertiesName );
        Properties prop = new Properties();
        if (key == null || key.equals("") || key.equals("null")) {
            return "";
        }
        String result = "";
        try {
            prop.load(in);
            result = prop.getProperty(key);;
        } catch (IOException ex) {
            logger.error("", ex);
            throw new AppRuntimeException(ex,null,null);
        }finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException ex) {
                    logger.error("", ex);
                    throw new AppRuntimeException(ex,null,null);
                }
            }
        }
        return result;
    }
}


