package com.hason.patterns.adapter;

import com.hason.patterns.adapter.thirdpart.Base64;
import com.hason.patterns.adapter.thirdpart.GuavaBase64;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * 适配器模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/3
 */
public class AdapterTest {

    @Test
    public void base64Adapter() {
        // 创建一个第三方的算法工具
        Base64 base64 = new GuavaBase64();
        // 将第三方的工具包装成统一的加密工具接口适配器
        Aead adapter = new Base64Adapter(base64);
        // 测试适配器
        String text = "Halo Hason!";
        String ciphertext = adapter.encrypt(text);
        String plaintext = adapter.decrypt(ciphertext);
        assertThat(ciphertext).isNotBlank();
        assertThat(plaintext).isEqualTo(text);
        System.out.println(ciphertext);
        System.out.println(plaintext);
    }

}
