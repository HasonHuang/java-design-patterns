package com.hason.patterns.decorator;


import com.hason.patterns.decorator.component.ClothesProp;
import com.hason.patterns.decorator.component.HairProp;
import com.hason.patterns.decorator.component.Prop;
import com.hason.patterns.decorator.decorator.ColorDecorator;
import com.hason.patterns.decorator.decorator.GucciDecorator;
import com.hason.patterns.decorator.decorator.PropDecorator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * 装饰者模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/25
 */
public class DecoratorTest {

    @Test
    public void decorate() {
        // 计算道具费用
        Prop hair = new HairProp("A发型", BigDecimal.ONE);
        assertThat(hair.cost()).isOne();
        System.out.println(String.format("购买【%s】花费了【%s】", hair.name(), hair.cost()));

        // 附加颜色
        Prop colorHair = new ColorDecorator(hair);
        assertThat(colorHair.cost()).isGreaterThan(hair.cost());
        System.out.println(String.format("购买【%s】花费了【%s】", colorHair.name(), colorHair.cost()));
        // 附加牌子
        Prop gucciHair = new GucciDecorator(colorHair);
        assertThat(gucciHair.cost()).isGreaterThan(colorHair.cost());
        System.out.println(String.format("购买【%s】花费了【%s】", gucciHair.name(), gucciHair.cost()));

        Prop clothes = new GucciDecorator(new ClothesProp("衣服", BigDecimal.ONE));
        assertThat(clothes.cost()).isGreaterThan(BigDecimal.ONE);
        System.out.println(String.format("购买【%s】花费了【%s】", clothes.name(), clothes.cost()));
    }

}
