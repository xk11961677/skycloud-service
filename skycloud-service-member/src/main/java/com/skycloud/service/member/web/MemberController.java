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
package com.skycloud.service.member.web;

import com.sky.framework.common.LogUtils;
import com.sky.framework.model.dto.MessageRes;
import com.sky.framework.model.util.UserContextHolder;
import com.sky.framework.web.support.BaseController;
import com.skycloud.service.member.api.model.dto.CustomLoginDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author code generator
 * @date 2019-06-15 15:01:41
 */
@RestController
@AllArgsConstructor
@RequestMapping("/member")
@Api(value = "WEB - MemberController", tags = "MemberController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class MemberController extends BaseController {


    @ApiOperation(httpMethod = "POST", value = "获取用户信息")
    @PostMapping("/getUser")
    public MessageRes<CustomLoginDTO> getUser() {
        Long userId = UserContextHolder.getInstance().getUserId();
        String channel = UserContextHolder.getInstance().getChannel();
        LogUtils.info(log, "getUser info ");
        CustomLoginDTO customLoginDto = new CustomLoginDTO();
        customLoginDto.setLoginName("123456");
        return MessageRes.success(customLoginDto);
    }

}
