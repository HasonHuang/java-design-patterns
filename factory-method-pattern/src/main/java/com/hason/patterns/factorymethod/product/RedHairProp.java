package com.hason.patterns.factorymethod.product;

/**
 * 红色发型道具（具体产品角色）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class RedHairProp implements Prop {
    @Override
    public String name() {
        return "红色发型道具";
    }
}
