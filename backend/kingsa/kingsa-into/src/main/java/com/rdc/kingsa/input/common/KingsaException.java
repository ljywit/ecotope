package com.rdc.kingsa.input.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KingsaException extends RuntimeException {
	/**
	 * 异常编码
	 */
	private String errorCode;
	/**
	 * 异常的message，由errorCode从国际化资源文件中获取
	 */
	private String errorMsg;
	/**
	 * 抛出异常的上下文内容，用于替换message中的变量表达式
	 */
	private Map contextMap;

	/**
	 * 构造方法
	 */
	public KingsaException() {
		super();
	}

	/**
	 * 构造方法
	 *
	 * @param errorCode 错误代码
	 */
	public KingsaException(final String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 构造方法
	 *
	 * @param errorCode 错误代码
	 * @param errorMessage 错误信息
	 */
	public KingsaException(final String errorCode, final String errorMessage) {
		this.errorCode = errorCode;
		this.errorMsg =errorMessage;
	}

	/**
	 * 构造方法
	 *
	 * @param errorCode 错误代码
	 * @param contextMap 异常上下文
	 */
	public KingsaException(final String errorCode, final Map contextMap) {
		this.errorCode = errorCode;
		this.contextMap = contextMap;
	}

	/**
	 * 构造方法
	 *
	 * @param errorCode 错误代码
	 * @param t 异常上下文
	 */
	public KingsaException(final String errorCode, final Throwable t) {
		super(t);
		this.errorCode = errorCode;
		this.contextMap = new HashMap();
	}

	/**
	 * 构造方法
	 *
	 * @param errorCode 错误代码
	 * @param errorList 错误集合
	 */
	public KingsaException(final String errorCode, final List<String> errorList) {
		this.errorCode = errorCode;
		this.contextMap = new HashMap();
	}

	/**
	 * 构造方法
	 *
	 * @param errorCode 错误代码
	 * @param contextMap 异常上下文
	 * @param t 异常
	 */
	public KingsaException(final String errorCode, final Map contextMap, final Throwable t) {
		super(t);
		this.errorCode = errorCode;
		this.contextMap = contextMap;
	}

	/**
	 * error code getter
	 *
	 * @return errorCode 异常代码
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * error code setter
	 *
	 * @param errorCode 异常代码
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * context getter
	 *
	 * @return contextMap 异常上下文
	 */
	public Map getContextMap() {
		return contextMap;
	}

	/**
	 * context setter
	 *
	 * @param contextMap 异常上下文
	 */
	public void setContextMap(Map contextMap) {
		this.contextMap = contextMap;
	}

	/**
	 * error message getter
	 *
	 * @return errorMsg error message
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * error message setter
	 *
	 * @param errorMsg 异常信息
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
