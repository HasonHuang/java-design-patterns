package com.hason.patterns.decorator.decorator;


import com.hason.patterns.decorator.component.Prop;

import java.math.BigDecimal;

/**
 * 品牌装饰类（具体装饰类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/25
 */
public class GucciDecorator extends PropDecorator {

    public GucciDecorator(Prop prop) {
        super(prop);
    }

    @Override
    public String name() {
        return "Gucci's " + getProp().name();
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("6.6").add(getProp().cost());
    }
}
