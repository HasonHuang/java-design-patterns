package com.hason.patterns.adapter.thirdpart;

/**
 * 模拟第三方提供的 base64 接口（被适配者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/3
 */
public interface Base64 {

    /**
     * 编码
     *
     * @param text 文本
     * @return base64
     */
    String encode(String text);

    /**
     * 解码
     *
     * @param base64text base64 文本
     * @return 解码后的文本
     */
    String decode(String base64text);

}
