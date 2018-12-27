package com.hason.patterns.abstractfactory;

import com.hason.patterns.abstractfactory.factory.PropFactory;
import com.hason.patterns.abstractfactory.factory.SpringPropFactory;
import com.hason.patterns.abstractfactory.factory.SummerPropFactory;
import com.hason.patterns.abstractfactory.product.ClothesProp;
import com.hason.patterns.abstractfactory.product.HairProp;
import org.junit.Test;

/**
 * 抽象工厂 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class AbstractFactoryTest {

    @Test
    public void createSpring() {
        PropFactory factory = new SpringPropFactory();
        ClothesProp clothes = factory.createClothes();
        System.out.println("创建：" + clothes.name());
        HairProp hair = factory.createHair();
        System.out.println("创建：" + hair.name());
    }

    @Test
    public void createSummer() {
        PropFactory factory = new SummerPropFactory();
        ClothesProp clothes = factory.createClothes();
        System.out.println("创建：" + clothes.name());
        HairProp hair = factory.createHair();
        System.out.println("创建：" + hair.name());
    }

}
