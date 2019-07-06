package com.skycloud.service.member.handler;

import com.sky.framework.job.handler.BeanJobHandler;
import com.skycloud.service.member.api.model.dto.CustomLoginDto;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

/**
 * @author
 */
@JobHandler("MemberDemoHandler")
@Component
public class DemoHandler extends BeanJobHandler<CustomLoginDto> {

    @Override
    public CustomLoginDto exec(String param) {
        System.out.println("-----------" + param);
        CustomLoginDto customLoginDto = new CustomLoginDto();
        customLoginDto.setLoginName("123456");
        return customLoginDto;
    }
}
