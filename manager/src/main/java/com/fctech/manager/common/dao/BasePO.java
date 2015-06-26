package com.fctech.manager.common.dao;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * Created by joe on 15/6/24.
 */
public class BasePO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected static final String DATE_FORMAT = "yyyy.MM.dd";
	protected static final String TIME_FORMAT = "HH:mm:ss";

	protected static final String DATE_TIME_FORMAT = "yyyy.MM.dd HH:mm:ss";

	protected static final String TIMESTAMP_FORMAT = "yyyy.MM.dd HH:mm:ss.S";
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
}
