package com.skycloud.service.member.api.service;

import com.sky.framework.model.dto.MessageRes;
import com.skycloud.base.common.feign.CustomFeignAutoConfiguration;
import com.skycloud.service.common.constant.FeginConstant;
import com.skycloud.service.member.api.model.dto.CustomLoginDto;
import com.skycloud.service.member.api.service.factory.AdUserFeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author
 */
@FeignClient(name = FeginConstant.MEMBER, configuration = CustomFeignAutoConfiguration.class, fallbackFactory = AdUserFeignFallbackFactory.class)
public interface AdUserFeignApi {

    /**
     * 登录
     *
     * @param customLoginDto
     * @return
     */
    @PostMapping(value = "/api/user/login")
    MessageRes<CustomLoginDto> login(@RequestBody CustomLoginDto customLoginDto);
}
