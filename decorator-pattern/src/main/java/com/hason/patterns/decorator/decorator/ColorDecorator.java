package com.hason.patterns.decorator.decorator;


import com.hason.patterns.decorator.component.Prop;

import java.math.BigDecimal;

/**
 * 颜色装饰器（具体装饰类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/25
 */
public class ColorDecorator extends PropDecorator {

    /**
     * 为道具增加颜色
     */
    public ColorDecorator(Prop prop) {
        super(prop);
    }

    @Override
    public String name() {
        return "绿色的" + getProp().name();
    }

    @Override
    public BigDecimal cost() {
        // 绿色价格 + 发型价格
        return new BigDecimal("888.88").add(getProp().cost());
    }
}
