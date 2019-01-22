package com.hason.patterns.prototype;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 原型模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/19
 */
@Slf4j
public class PrototypeTest {
    
    @Test
    public void test() {
        // 初始化原型对象
        AnimalMapResource rabbit = new AnimalMapResource(1L, "小白兔");
        MapResourceLoader.getInstance()
                .map(AnimalMapResource.class, rabbit);
        log.info("原型对象: " + rabbit);
        
        // 使用原型对象创建新的对象
        MapResource<AnimalMapResource> rabbit2 = MapResourceLoader.getInstance()
                .get(AnimalMapResource.class);
        assertThat(rabbit2)
                .isNotNull()
                .isNotSameAs(rabbit)
                .isInstanceOf(AnimalMapResource.class);
        assertThat(((AnimalMapResource) rabbit2).getId())
                .isEqualTo(rabbit.getId() + 1);
        log.info("加载新对象:" + rabbit2);

        MapResource<AnimalMapResource> rabbit3 = MapResourceLoader.getInstance()
                .get(AnimalMapResource.class);
        assertThat(rabbit3)
                .isNotNull()
                .isNotSameAs(rabbit2)
                .isInstanceOf(AnimalMapResource.class);
        assertThat(((AnimalMapResource) rabbit3).getId())
                .isEqualTo(((AnimalMapResource)rabbit2).getId() + 1);
        log.info("加载新对象:" + rabbit3);
    }
    
}
