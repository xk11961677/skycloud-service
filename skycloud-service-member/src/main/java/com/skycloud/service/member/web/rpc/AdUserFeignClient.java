package com.skycloud.service.member.web.rpc;

import com.sky.framework.common.LogUtil;
import com.sky.framework.model.dto.MessageRes;
import com.sky.framework.web.support.BaseController;
import com.skycloud.service.member.api.model.dto.CustomLoginDto;
import com.skycloud.service.member.api.service.AdUserFeignApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
@RestController
@Api(value = "API - AdUserFeignClient", tags = "AdUserFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class AdUserFeignClient extends BaseController implements AdUserFeignApi {


    @ApiOperation(httpMethod = "POST", value = "用户登录")
    @Override
    public MessageRes<CustomLoginDto> login(@RequestBody CustomLoginDto customLoginDto) {
        LogUtil.info(log, "login customLoginDto:{}", customLoginDto);

        return MessageRes.success(customLoginDto);
    }

}
