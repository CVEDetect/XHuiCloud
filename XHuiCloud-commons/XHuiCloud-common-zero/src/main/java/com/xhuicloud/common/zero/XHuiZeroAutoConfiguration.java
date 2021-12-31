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

package com.xhuicloud.common.zero;

import com.xhuicloud.common.zero.base.IDGenerate;
import com.xhuicloud.common.zero.properties.DefaultSnowflakeProperties;
import com.xhuicloud.common.zero.snowflake.DefaultSnowflakeIDGenerateBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


/**
 * @program: XHuiCloud
 * @description: ZeroAutoConfiguration
 * @author: Sinda
 * @create: 2020-03-05 17:08
 */
@EnableConfigurationProperties(DefaultSnowflakeProperties.class)
@ConditionalOnMissingBean(IDGenerate.class)
public class XHuiZeroAutoConfiguration {

    /**
     * 自动配置
     *
     * @param properties
     * @return
     */
    @Bean
    public IDGenerate defaultSnowflakeIDGenerate(DefaultSnowflakeProperties properties) {
        return DefaultSnowflakeIDGenerateBuilder
                .create()
                .zkAddress(properties.getZkAddress())
                .port(properties.getPort())
                .build();
    }

}
