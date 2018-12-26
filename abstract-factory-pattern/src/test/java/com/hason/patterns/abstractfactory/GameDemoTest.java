package com.hason.patterns.abstractfactory;

import com.hason.patterns.abstractfactory.factory.PropFactory;
import com.hason.patterns.abstractfactory.factory.SpringPropFactory;
import com.hason.patterns.abstractfactory.factory.SummerPropFactory;
import com.hason.patterns.abstractfactory.product.ClothesProp;
import com.hason.patterns.abstractfactory.product.HairProp;

/**
 * 游戏客户端
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class GameDemoTest {

    public static void main(String[] args) {
        System.out.println("=========== 春天主题 ==========");
        PropFactory factory = new SpringPropFactory();
        ClothesProp clothes = factory.createClothes();
        System.out.println("创建：" + clothes.name());
        HairProp hair = factory.createHair();
        System.out.println("创建：" + hair.name());

        System.out.println("=========== 夏天主题 ==========");
        factory = new SummerPropFactory();
        clothes = factory.createClothes();
        System.out.println("创建：" + clothes.name());
        hair = factory.createHair();
        System.out.println("创建：" + hair.name());
    }

}
