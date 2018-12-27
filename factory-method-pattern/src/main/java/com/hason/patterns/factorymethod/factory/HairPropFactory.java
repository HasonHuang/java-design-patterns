package com.hason.patterns.factorymethod.factory;


import com.hason.patterns.factorymethod.product.GreenHairProp;
import com.hason.patterns.factorymethod.product.Prop;

/**
 * 发型道具工厂（具体工厂）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class HairPropFactory extends PropFactory {
    @Override
    public Prop create() {
        return new GreenHairProp();
    }
}
