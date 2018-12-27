package com.hason.patterns.factorymethod.factory;


import com.hason.patterns.factorymethod.product.ChanelClothesProp;
import com.hason.patterns.factorymethod.product.Prop;

/**
 * 衣服道具工厂（具体工厂）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class ClothesPropFactory extends PropFactory {
    @Override
    public Prop create() {
        return new ChanelClothesProp();
    }
}
