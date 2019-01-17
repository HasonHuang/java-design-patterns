package com.hason.patterns.proxy;

/**
 * 道具类（抽象主题）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/17
 */
public interface Prop {

    /**
     * 获取道具
     */
    void acquiredBy(User user);

    /**
     * 使用道具
     */
    void useBy(User user);

}
