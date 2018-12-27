package com.hason.patterns.decorator.decorator;

import com.hason.patterns.decorator.component.Prop;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 道具装饰类（抽象装饰类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/25
 */
@AllArgsConstructor
public abstract class PropDecorator implements Prop {

    @Getter
    private Prop prop;

}
