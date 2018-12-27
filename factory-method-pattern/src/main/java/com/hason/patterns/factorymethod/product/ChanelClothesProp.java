package com.hason.patterns.factorymethod.product;

/**
 * 香奈儿衣服道具（具体产品角色）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class ChanelClothesProp implements Prop {
    @Override
    public String name() {
        return "香奈儿衣服道具";
    }
}
