package com.hason.patterns.abstractfactory.product;

/**
 * 绿色发型道具（具体产品）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class GreenHairProp implements HairProp {
    @Override
    public String name() {
        return "绿色发型";
    }
}
