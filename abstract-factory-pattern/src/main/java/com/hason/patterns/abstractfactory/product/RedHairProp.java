package com.hason.patterns.abstractfactory.product;

/**
 * 红色发型道具（具体产品）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class RedHairProp implements HairProp {
    @Override
    public String name() {
        return "红色发型";
    }
}
