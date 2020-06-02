package com.atguigu.crowd.exception;

/**
 * 更新Admin时，如果检测到登录账号重复，则抛出这个异常
 * @author zhengyuli
 */
public class LoginAcctAlreadyInUseForUpdateException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LoginAcctAlreadyInUseForUpdateException() {
		super();
	}

	public LoginAcctAlreadyInUseForUpdateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LoginAcctAlreadyInUseForUpdateException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginAcctAlreadyInUseForUpdateException(String message) {
		super(message);
	}

	public LoginAcctAlreadyInUseForUpdateException(Throwable cause) {
		super(cause);
	}
}
