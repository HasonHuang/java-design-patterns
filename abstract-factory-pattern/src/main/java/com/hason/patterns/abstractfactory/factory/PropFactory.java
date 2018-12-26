package com.hason.patterns.abstractfactory.factory;

import com.hason.patterns.abstractfactory.product.ClothesProp;
import com.hason.patterns.abstractfactory.product.HairProp;

/**
 * 道具工厂（抽象工厂）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public interface PropFactory {

    /**
     * 创建发型道具
     */
    HairProp createHair();

    /**
     * 创建衣服道具
     */
    ClothesProp createClothes();
}
