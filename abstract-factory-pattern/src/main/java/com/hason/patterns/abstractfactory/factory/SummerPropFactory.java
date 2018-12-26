package com.hason.patterns.abstractfactory.factory;

import com.hason.patterns.abstractfactory.product.ClothesProp;
import com.hason.patterns.abstractfactory.product.HairProp;
import com.hason.patterns.abstractfactory.product.RedClothesProp;
import com.hason.patterns.abstractfactory.product.RedHairProp;

/**
 * 夏天主题的道具工厂（具体工厂）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class SummerPropFactory implements PropFactory {
    @Override
    public HairProp createHair() {
        return new RedHairProp();
    }

    @Override
    public ClothesProp createClothes() {
        return new RedClothesProp();
    }
}
