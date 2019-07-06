package com.skycloud.service.member.api.service.factory;

import com.skycloud.service.member.api.service.AdUserFeignApi;
import com.skycloud.service.member.api.service.fallback.AdUserFeignFallback;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author
 */
@Component
public class AdUserFeignFallbackFactory implements FallbackFactory<AdUserFeignApi> {

    @Override
    public AdUserFeignApi create(Throwable throwable) {
        AdUserFeignFallback fallback = new AdUserFeignFallback();
        fallback.setCause(throwable);
        return fallback;
    }
}
