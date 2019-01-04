package com.hason.patterns.facade;

/**
 * 新的加密接口（抽象外观类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/4
 */
public interface Facade {

    /**
     * 读取、解密源文件后，添加信息并保存
     *
     * @param path 文件路径
     * @param content 追加的文件内容
     */
    void save(String path, String content);

}
