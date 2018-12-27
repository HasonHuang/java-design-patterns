package com.hason.patterns.factorymethod;

import com.hason.patterns.factorymethod.factory.ClothesPropFactory;
import com.hason.patterns.factorymethod.factory.HairPropFactory;
import com.hason.patterns.factorymethod.factory.PropFactory;
import com.hason.patterns.factorymethod.product.Prop;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 工厂方法模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/28
 */
public class FactoryMethodTest {

    @Test
    public void create() {
        // 可以通过配置文件切换实现类
        PropFactory factory1 = new HairPropFactory();
        Prop p1 = factory1.create();
        assertThat(p1).isNotNull();
        System.out.println("得到：" + p1.name());

        PropFactory factory2 = new ClothesPropFactory();
        Prop p2 = factory2.create();
        assertThat(p2).isNotNull();
        System.out.println("得到：" + p2.name());
    }

}
