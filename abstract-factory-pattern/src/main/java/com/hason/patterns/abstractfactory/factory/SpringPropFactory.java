package com.hason.patterns.abstractfactory.factory;

import com.hason.patterns.abstractfactory.product.ClothesProp;
import com.hason.patterns.abstractfactory.product.GreenClothesProp;
import com.hason.patterns.abstractfactory.product.GreenHairProp;
import com.hason.patterns.abstractfactory.product.HairProp;

/**
 * 春天主题的道具工厂（具体工厂）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class SpringPropFactory implements PropFactory {
    @Override
    public HairProp createHair() {
        return new GreenHairProp();
    }

    @Override
    public ClothesProp createClothes() {
        return new GreenClothesProp();
    }
}
