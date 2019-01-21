package com.hason.patterns.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 春天主题的人物模型（具体建造者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/21
 */
@Slf4j
public class SpringModelBuilder implements ModelBuilder {

    private Model model = new Model();

    @Override
    public ModelBuilder buildSex() {
        model.setSex("女");
        log.info("配置【" + model.getSex() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildHair() {
        model.setHair("蓝色头发");
        log.info("配置【" + model.getHair() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildClothes() {
        model.setClothes("湖蓝色衣服");
        log.info("配置【" + model.getClothes() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildShoe() {
        model.setShoe("蓝色衣服");
        log.info("配置【" + model.getShoe() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildGun() {
        model.setGun("蓝色步枪");
        log.info("配置【" + model.getGun() + "】");
        return this;
    }

    @Override
    public Model build() {
        return model;
    }
}
