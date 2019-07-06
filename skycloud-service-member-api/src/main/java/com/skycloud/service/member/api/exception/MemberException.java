package com.skycloud.service.member.api.exception;

import com.skycloud.service.common.enums.ErrorCodeEnum;
import com.sky.framework.model.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;


/**
 * 
 *
 * @author
 */
@Slf4j
public class MemberException extends BusinessException {

	private static final long serialVersionUID = -6552248511084911254L;

	/**
	 * Instantiates a new Omc rpc exception.
	 */
	public MemberException() {
	}

	/**
	 * Instantiates a new Omc rpc exception.
	 *
	 * @param code      the code
	 * @param msgFormat the msg format
	 * @param args      the args
	 */
	public MemberException(int code, String msgFormat, Object... args) {
		super(code, msgFormat, args);
	}

	/**
	 * Instantiates a new Omc rpc exception.
	 *
	 * @param code the code
	 * @param msg  the msg
	 */
	public MemberException(int code, String msg) {
		super(code, msg);
	}

	/**
	 * Instantiates a new Omc rpc exception.
	 *
	 * @param codeEnum the code enum
	 */
	public MemberException(ErrorCodeEnum codeEnum) {
		super(codeEnum.code(), codeEnum.msg());
	}

}
