package com.hason.patterns.prototype;

/**
 * 抽象地图资源（抽象原型类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/19
 */
public interface MapResource<T> {

    /**
     * 克隆一个新对象
     */
    T clone();

}
