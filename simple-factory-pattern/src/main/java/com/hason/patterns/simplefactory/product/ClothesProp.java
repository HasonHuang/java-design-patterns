package com.hason.patterns.simplefactory.product;

/**
 * 衣服道具（具体产品角色）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class ClothesProp implements Prop {
    @Override
    public String name() {
        return "衣服道具";
    }
}
