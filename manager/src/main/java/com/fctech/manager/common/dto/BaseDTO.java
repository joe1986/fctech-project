/**
 * 
 */
package com.fctech.manager.common.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Created by joe on 15/6/24.
 */
public class BaseDTO implements Serializable {

    private static final long serialVersionUID = -1063188008194990237L;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
