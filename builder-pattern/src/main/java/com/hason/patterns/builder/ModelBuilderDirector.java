package com.hason.patterns.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 模型建造者的指挥者（指挥者类、导演类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/21
 */
@Slf4j
public class ModelBuilderDirector {

    /** 建造者 */
    private ModelBuilder builder;

    public ModelBuilderDirector(ModelBuilder builder) {
        this.builder = builder;
    }

    /**
     * 指挥者负责按指定顺序创建产品
     *
     * @return 模型
     */
    public Model construct() {
        log.info("指挥者开始构建人物模型");
        return builder
                .buildSex()
                .buildHair()
                .buildClothes()
                .buildShoe()
                .buildGun()
                .build();
    }

}
