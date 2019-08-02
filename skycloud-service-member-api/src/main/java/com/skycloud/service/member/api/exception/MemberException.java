/*
 * The MIT License (MIT)
 * Copyright © 2019 <sky>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the “Software”), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
