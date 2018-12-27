package com.hason.patterns.factorymethod.product;

/**
 * 绿色发型道具（具体产品角色）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class GreenHairProp implements Prop {
    @Override
    public String name() {
        return "绿色发型道具";
    }
}
