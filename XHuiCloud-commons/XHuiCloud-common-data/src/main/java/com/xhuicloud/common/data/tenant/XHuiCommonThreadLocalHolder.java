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

package com.xhuicloud.common.data.tenant;

import com.alibaba.ttl.TransmittableThreadLocal;

/**
 * @program: XHuiCloud
 * @description: TenantHolder
 * @author: Sinda
 * @create: 2020-05-12 16:42
 */
public class XHuiCommonThreadLocalHolder {

    /**
     * 创建本地线程共享对象  租户Id
     */
    private static final ThreadLocal<Integer> TENANT = new TransmittableThreadLocal<>();

    /**
     * 创建本地线程共享对象  用户Id
     */
    private static final ThreadLocal<Integer> USERID = new TransmittableThreadLocal<>();

    public static void setTenant(Integer id) {
        TENANT.set(id);
    }

    public static Integer getTenant() {
        return TENANT.get();
    }

    public static void removeTenant() {
        TENANT.remove();
    }

    public static void removeUserId() {
        USERID.remove();
    }

    public static void setUserId(Integer id) {
        USERID.set(id);
    }

    public static Integer getUserId() {
        return USERID.get();
    }

}
