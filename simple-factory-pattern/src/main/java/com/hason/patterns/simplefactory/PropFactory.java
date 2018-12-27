package com.hason.patterns.simplefactory;


import com.hason.patterns.simplefactory.product.ClothesProp;
import com.hason.patterns.simplefactory.product.HairProp;
import com.hason.patterns.simplefactory.product.Prop;
import com.hason.patterns.simplefactory.product.PropType;

/**
 * 道具的简单工厂（工厂角色）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class PropFactory {

    public static Prop create(PropType type) {
        switch (type) {
            case HAIR:
                return new HairProp();
            case CLOTHES:
                return new ClothesProp();
            default:
                throw new IllegalArgumentException("Unknown type:" + type);
        }
    }

}
