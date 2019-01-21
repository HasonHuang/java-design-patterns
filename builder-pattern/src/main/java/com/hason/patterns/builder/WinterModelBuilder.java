package com.hason.patterns.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 冬天主题的人物模型（具体建造者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/21
 */
@Slf4j
public class WinterModelBuilder implements ModelBuilder {

    private Model model = new Model();

    @Override
    public ModelBuilder buildSex() {
        model.setSex("男");
        log.info("配置【" + model.getSex() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildHair() {
        model.setHair("绿色头发");
        log.info("配置【" + model.getHair() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildClothes() {
        model.setClothes("薄荷绿衣服");
        log.info("配置【" + model.getClothes() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildShoe() {
        model.setShoe("绿色衣服");
        log.info("配置【" + model.getShoe() + "】");
        return this;
    }

    @Override
    public ModelBuilder buildGun() {
        model.setGun("绿色手枪");
        log.info("配置【" + model.getGun() + "】");
        return this;
    }

    @Override
    public Model build() {
        return model;
    }
}
