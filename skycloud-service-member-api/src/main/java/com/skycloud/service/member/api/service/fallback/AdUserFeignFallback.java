package com.skycloud.service.member.api.service.fallback;

import com.sky.framework.common.LogUtil;
import com.sky.framework.model.dto.MessageRes;
import com.sky.framework.model.enums.FailureCodeEnum;
import com.skycloud.service.member.api.model.dto.CustomLoginDto;
import com.skycloud.service.member.api.service.AdUserFeignApi;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author
 */
//@Component
@Slf4j
public class AdUserFeignFallback implements AdUserFeignApi {

    @Setter
    private Throwable cause;

    @Override
    public MessageRes<CustomLoginDto> login(CustomLoginDto customLoginDto) {
        LogUtil.error(log, "feign fallback :{} ", cause);
        return MessageRes.fail(FailureCodeEnum.GL990002.getCode(), FailureCodeEnum.GL990002.getMsg());
    }

}
