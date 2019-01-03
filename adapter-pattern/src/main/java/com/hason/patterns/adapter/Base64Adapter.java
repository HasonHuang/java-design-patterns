package com.hason.patterns.adapter;

import com.hason.patterns.adapter.thirdpart.Base64;
import lombok.AllArgsConstructor;

/**
 * Base64 适配器（适配器类）
 *
 * 将第三方的加密算法转换成新的接口
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/3
 */
@AllArgsConstructor
public class Base64Adapter implements Aead {

    private Base64 base64;

    @Override
    public String encrypt(String plaintext) {
        return base64.encode(plaintext);
    }

    @Override
    public String decrypt(String ciphertext) {
        return base64.decode(ciphertext);
    }
}
