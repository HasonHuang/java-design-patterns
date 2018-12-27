package com.hason.patterns.factorymethod.factory;


import com.hason.patterns.factorymethod.product.Prop;

/**
 * 道具工厂（抽象工厂）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public abstract class PropFactory {

    /**
     * 创建道具
     */
    public abstract Prop create();

}
