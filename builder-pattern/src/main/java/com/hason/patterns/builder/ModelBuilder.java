package com.hason.patterns.builder;

/**
 * 人物模型生成器（抽象建造者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/21
 */
public interface ModelBuilder {

    // 思考：buildXXX 方法如何使用参数？例如：buildHair(String hair)

    ModelBuilder buildSex();
    ModelBuilder buildHair();
    ModelBuilder buildClothes();
    ModelBuilder buildShoe();
    ModelBuilder buildGun();

    /**
     * 创建模型对象
     */
    Model build();

}
