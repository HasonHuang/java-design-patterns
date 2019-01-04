package com.hason.patterns.facade.subsystem;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;

/**
 * 用户信息的操作系统
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/4
 */
public class UserInfoOperateSystem {

    /**
     * 添加用户信息
     *
     * @param original 源密文内容
     * @param append 新增内容
     * @return 新内容的密文
     */
    public String add(String original, String append) {
        // 加密新内容
        return original
                + "\n"
                + BaseEncoding.base64().encode(append.getBytes(Charsets.UTF_8));
    }

}
