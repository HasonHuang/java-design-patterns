package com.hason.patterns.abstractfactory.product;

/**
 * 绿色衣服（具体产品）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class GreenClothesProp implements ClothesProp {
    @Override
    public String name() {
        return "绿色衣服";
    }
}
