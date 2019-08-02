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
package com.skycloud.service.member.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author code generator
 * @date 2019-06-15 15:01:41
 */
@Data
@Table(name = "xx_member")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     */
    @Column(name = "create_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;
    /**
     *
     */
    @Column(name = "modify_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyDate;
    /**
     *
     */
    private String address;
    /**
     *
     */
    private BigDecimal amount;
    /**
     *
     */
    @Column(name = "attribute_value0")
    private String attributeValue0;
    /**
     *
     */
    @Column(name = "attribute_value1")
    private String attributeValue1;
    /**
     *
     */
    @Column(name = "attribute_value2")
    private String attributeValue2;
    /**
     *
     */
    @Column(name = "attribute_value3")
    private String attributeValue3;
    /**
     *
     */
    @Column(name = "attribute_value4")
    private String attributeValue4;
    /**
     *
     */
    @Column(name = "attribute_value5")
    private String attributeValue5;
    /**
     *
     */
    @Column(name = "attribute_value6")
    private String attributeValue6;
    /**
     *
     */
    @Column(name = "attribute_value7")
    private String attributeValue7;
    /**
     *
     */
    @Column(name = "attribute_value8")
    private String attributeValue8;
    /**
     *
     */
    @Column(name = "attribute_value9")
    private String attributeValue9;
    /**
     *
     */
    private BigDecimal balance;
    /**
     *
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birth;
    /**
     *
     */
    private String email;
    /**
     *
     */
    private Integer gender;
    /**
     *
     */
    @Column(name = "is_enabled")
    private Integer isEnabled;
    /**
     *
     */
    @Column(name = "is_locked")
    private Boolean isLocked;
    /**
     *
     */
    @Column(name = "locked_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lockedDate;
    /**
     *
     */
    @Column(name = "login_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date loginDate;
    /**
     * 0
     */
    @Column(name = "login_failure_count")
    private Integer loginFailureCount;
    /**
     *
     */
    @Column(name = "login_ip")
    private String loginIp;
    /**
     *
     */
    private String mobile;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String password;
    /**
     *
     */
    private String phone;
    /**
     *
     */
    private Long point;
    /**
     *
     */
    @Column(name = "register_ip")
    private String registerIp;
    /**
     *
     */
    @Column(name = "safe_key_expire")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date safeKeyExpire;
    /**
     *
     */
    @Column(name = "safe_key_value")
    private String safeKeyValue;
    /**
     *
     */
    private String username;
    /**
     *
     */
    @Column(name = "zip_code")
    private String zipCode;
    /**
     *
     */
    private Long area;
    /**
     *
     */
    @Column(name = "member_rank")
    private Long memberRank;
    /**
     *
     */
    @Column(name = "is_wechat_binding")
    private String isWechatBinding;
    /**
     *
     */
    private String wechatid;
    /**
     *
     */
    @Column(name = "create_user")
    private String createUser;
    /**
     *
     */
    @Column(name = "delete_flg")
    private String deleteFlg;
    /**
     *
     */
    @Column(name = "identity_card")
    private String identityCard;
    /**
     * 0：是员工   1：是家属   2：退休   3：离职
     */
    @Column(name = "member_type")
    private Integer memberType;
    /**
     *
     */
    @Column(name = "modify_user")
    private String modifyUser;
    /**
     *
     */
    @Column(name = "super_user_id")
    private Long superUserId;
    /**
     *
     */
    @Column(name = "group_id")
    private Long groupId;
    /**
     *
     */
    @Column(name = "ad_id")
    private String adId;

    /**
     *
     */
    @Column(name = "buy_jxticket_count")
    private Integer buyJxticketCount;
    /**
     * 推荐人会员号 0：独立会员，无推荐
     */
    @Column(name = "source_card_number")
    private String sourceCardNumber;
    /**
     *
     */
    private Integer state;
    /**
     *
     */
    @Column(name = "member_state")
    private Integer memberState;
    /**
     * 是否已通过分销商购买 0:否 1:是
     */
    @Column(name = "is_bussiness_buy")
    private Integer isBussinessBuy;
    /**
     *
     */
    @Column(name = "is_business_buy")
    private Integer isBusinessBuy;

    /**
     * 明文密码
     */
    @Transient
    private String pwd;
}
