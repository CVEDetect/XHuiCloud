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

package com.xhuicloud.pay.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhuicloud.common.data.tenant.XHuiCommonThreadLocalHolder;
import com.xhuicloud.common.zero.base.IDGenerate;
import com.xhuicloud.pay.dto.PayOrderDto;
import com.xhuicloud.pay.entity.PayOrderAll;
import com.xhuicloud.pay.mapper.PayOrderAllMapper;
import com.xhuicloud.pay.service.PayOrderAllService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class PayOrderAllServiceImpl extends ServiceImpl<PayOrderAllMapper, PayOrderAll> implements PayOrderAllService {

    private final IDGenerate defaultSnowflakeIDGenerate;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public PayOrderAll create(PayOrderDto payOrderDto) {
        PayOrderAll payOrderAll = new PayOrderAll();
        BeanUtil.copyProperties(payOrderDto, payOrderAll);
        payOrderAll.setOrderNo(String.valueOf(defaultSnowflakeIDGenerate.get()));
        payOrderAll.setTenantId(XHuiCommonThreadLocalHolder.getTenant());
        payOrderAll.setState(0);
        save(payOrderAll);
        return payOrderAll;
    }
}
