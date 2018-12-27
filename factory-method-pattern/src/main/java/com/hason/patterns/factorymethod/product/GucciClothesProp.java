package com.hason.patterns.factorymethod.product;

/**
 * 古驰衣服道具（具体产品角色）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class GucciClothesProp implements Prop {
    @Override
    public String name() {
        return "古驰衣服道具";
    }
}
