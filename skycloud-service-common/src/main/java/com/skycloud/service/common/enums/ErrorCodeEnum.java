package com.skycloud.service.common.enums;


import com.sky.framework.model.enums.ErrorCode;

/**
 * The class Error code enum.
 * @author
 */
public enum ErrorCodeEnum implements ErrorCode {

	MEMBER160001(160001, "您验证次数过多，请1小时后重试!");

	private int code;

	private String msg;

	/**
	 * Msg string.
	 *
	 * @return the string
	 */
	public String msg() {
		return msg;
	}

	/**
	 * Code int.
	 *
	 * @return the int
	 */
	public int code() {
		return code;
	}

	ErrorCodeEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * Gets enum.
	 *
	 * @param code the code
	 *
	 * @return the enum
	 */
	public static ErrorCodeEnum getEnum(int code) {
		for (ErrorCodeEnum ele : ErrorCodeEnum.values()) {
			if (ele.code() == code) {
				return ele;
			}
		}
		return null;
	}

	@Override
	public String getMsg() {
		return msg;
	}

	@Override
	public Integer getCode() {
		return code;
	}}
