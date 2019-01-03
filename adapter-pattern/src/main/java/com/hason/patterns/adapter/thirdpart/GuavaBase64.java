package com.hason.patterns.adapter.thirdpart;

import com.google.common.io.BaseEncoding;

/**
 * 模拟第三方提供的 base64 实现类（被适配者的实现类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/3
 */
public class GuavaBase64 implements Base64 {
    @Override
    public String encode(String text) {
        return BaseEncoding.base64().encode(text.getBytes());
    }

    @Override
    public String decode(String base64text) {
        return new String(BaseEncoding.base64().decode(base64text));
    }
}
