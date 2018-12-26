package com.hason.patterns.abstractfactory.product;

/**
 * 红色衣服（具体产品）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class RedClothesProp implements ClothesProp {
    @Override
    public String name() {
        return "红色衣服";
    }
}
