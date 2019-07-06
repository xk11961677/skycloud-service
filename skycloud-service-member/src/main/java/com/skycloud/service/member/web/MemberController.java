package com.skycloud.service.member.web;

import com.sky.framework.common.LogUtil;
import com.sky.framework.model.dto.MessageRes;
import com.sky.framework.model.util.UserContextHolder;
import com.sky.framework.web.support.BaseController;
import com.skycloud.service.member.api.model.dto.CustomLoginDto;
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
    public MessageRes<CustomLoginDto> getUser() {
        Long userId = UserContextHolder.getInstance().getUserId();
        String channel = UserContextHolder.getInstance().getChannel();
        LogUtil.info(log, "getUser info ");
        CustomLoginDto customLoginDto = new CustomLoginDto();
        customLoginDto.setLoginName("123456");
        return MessageRes.success(customLoginDto);
    }

}
