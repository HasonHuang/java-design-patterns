package com.hason.patterns.decorator.component;

import java.math.BigDecimal;

/**
 * 游戏道具（抽象组件）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/25
 */
public interface Prop {

    /**
     * 获取道具名字
     */
    String name();

    /**
     * 获取道具价格
     */
    BigDecimal cost();

}
