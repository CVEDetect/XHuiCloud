/*
 * MIT License
 * Copyright <2021-2022>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * @Author: Sinda
 * @Email:  xhuicloud@163.com
 */

package com.xhuicloud.upms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 终端信息
 */
@Data
@ApiModel(value = "客户端信息")
@EqualsAndHashCode(callSuper = true)
public class SysClientDetails extends Model<SysClientDetails> {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "客户端名称")
    private String name;

    @ApiModelProperty(value = "客户端id")
    private String clientId;

    @ApiModelProperty(value = "客户端资源id")
    private String resourceIds;

    @ApiModelProperty(value = "客户端密钥")
    private String clientSecret;

    @ApiModelProperty(value = "权限范围")
    private String scope;

    @ApiModelProperty(value = "授权类型")
    private String[] authorizedGrantTypes;

    @ApiModelProperty(value = "重定向地址")
    private String webServerRedirectUri;

    @ApiModelProperty(value = "客户端权限")
    private String authorities;

    @ApiModelProperty(value = "access_token的有效时间值(单位:秒)")
    private Integer accessTokenValidity;

    @ApiModelProperty(value = "refresh_token的有效时间值(单位:秒)")
    private Integer refreshTokenValidity;

    @ApiModelProperty(value = "登录验证码0: 否 1：是")
    private Integer captchaEnable;

    @ApiModelProperty(value = "重复登录0: 否 1：是")
    private Integer multiLogin;

    @ApiModelProperty(value = "令牌模式")
    private String tokenFormat;

    @ApiModelProperty(value = "自动授权")
    private String autoApprove;

    @ApiModelProperty(value = "0: 否 1：是")
    private Integer isDel;

    @ApiModelProperty(value = "租户id")
    private Integer tenantId;

    private static final long serialVersionUID = 1L;

}
