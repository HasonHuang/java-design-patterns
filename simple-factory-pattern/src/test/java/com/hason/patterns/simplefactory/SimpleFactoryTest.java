package com.hason.patterns.simplefactory;


import com.hason.patterns.simplefactory.product.Prop;
import com.hason.patterns.simplefactory.product.PropType;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * 简单工厂模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/26
 */
public class SimpleFactoryTest {

    @Test
    public void create() {
        Prop p1 = PropFactory.create(PropType.HAIR);
        assertThat(p1).isNotNull();
        System.out.println("得到：" + p1.name());
        Prop p2 = PropFactory.create(PropType.CLOTHES);
        assertThat(p2).isNotNull();
        System.out.println("得到：" + p2.name());
    }

}
