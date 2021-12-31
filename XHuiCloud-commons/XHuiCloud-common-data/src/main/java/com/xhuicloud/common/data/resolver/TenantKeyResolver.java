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

package com.xhuicloud.common.data.resolver;

import com.xhuicloud.common.core.utils.KeyStrResolver;
import com.xhuicloud.common.data.tenant.XHuiCommonThreadLocalHolder;

public class TenantKeyResolver implements KeyStrResolver {

    /**
     * 传入字符串增加 租户编号:in
     * @param in 输入字符串
     * @param split 分割符
     * @return
     */
    @Override
    public String extract(String in, String split) {
        return XHuiCommonThreadLocalHolder.getTenant() + split + in;
    }

    /**
     * 返回当前租户ID
     * @return
     */
    @Override
    public String key() {
        return String.valueOf(XHuiCommonThreadLocalHolder.getTenant());
    }

}
