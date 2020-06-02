package com.atguigu.crowd.exception;

/**
 * 用户在未登录状态下直接访问受保护资源时抛出的异常
 * @author zhengyuli
 */
public class AccessForbiddenException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccessForbiddenException() {
		super();
	}

	public AccessForbiddenException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccessForbiddenException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccessForbiddenException(String message) {
		super(message);
	}

	public AccessForbiddenException(Throwable cause) {
		super(cause);
	}
}
