package com.hason.patterns.decorator.component;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 * 发型道具（具体组件）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/25
 */
@AllArgsConstructor
public class HairProp implements Prop {

    /** 道具名 */
    private String name;
    /** 价格 */
    private BigDecimal price;

    @Override
    public String name() {
        return name;
    }

    @Override
    public BigDecimal cost() {
        return price;
    }
}
