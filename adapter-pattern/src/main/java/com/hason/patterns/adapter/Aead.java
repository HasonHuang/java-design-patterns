package com.hason.patterns.adapter;

/**
 * 新设计的接口（目标抽象类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/3
 */
public interface Aead {

    /**
     * 加密
     *
     * @param plaintext 明文
     * @return 密文
     */
    String encrypt(String plaintext);

    /**
     * 解密
     *
     * @param ciphertext 密文
     * @return 明文
     */
    String decrypt(String ciphertext);

}
