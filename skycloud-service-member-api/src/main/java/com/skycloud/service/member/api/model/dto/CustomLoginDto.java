package com.skycloud.service.member.api.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author
 */
@Data
@ApiModel("会员登录CustomLoginDto")
public class CustomLoginDto {

    /**
     * 手机号或用户名
     */
    @ApiModelProperty("手机号或用户名")
    private String loginName;

    /**
     *
     */
    private String password;


}
