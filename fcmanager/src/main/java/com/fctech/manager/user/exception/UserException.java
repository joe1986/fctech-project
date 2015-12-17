package com.fctech.manager.user.exception;

public class UserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String SYSTEM_ERROR = "1001";

	public static final String USER_NAME_NULL = "1002";

	public static final String USER_PASSWORD_NULL = "1003";

	public static final String USER_NAME_OR_PASSWORD_ERROR = "1004";

	public UserException(String errorCode, Throwable cause) {
		super(errorCode, cause);
	}

	public UserException(String errorCode) {
		super(errorCode);
	}

	public UserException() {
		super();
	}

	public String getErrorCode() {
		return super.getMessage();
	}
}
