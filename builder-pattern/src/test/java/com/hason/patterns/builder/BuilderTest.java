package com.hason.patterns.builder;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 建造者模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/21
 */
public class BuilderTest {

    @Test
    public void spring() {
        // 初始化生成器
        ModelBuilder builder = new SpringModelBuilder();
        // 初始化指挥者
        ModelBuilderDirector director = new ModelBuilderDirector(builder);
        // 创建人物模型
        Model model = director.construct();
        assertThat(model)
                .isNotNull()
                .isSameAs(director.construct());
    }

    @Test
    public void winter() {
        // 初始化生成器
        ModelBuilder builder = new WinterModelBuilder();
        // 初始化指挥者
        ModelBuilderDirector director = new ModelBuilderDirector(builder);
        // 创建人物模型
        Model model = director.construct();
        assertThat(model)
                .isNotNull()
                .isSameAs(director.construct());
    }

}
