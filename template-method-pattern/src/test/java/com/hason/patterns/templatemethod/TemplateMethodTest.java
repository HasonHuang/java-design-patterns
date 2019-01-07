package com.hason.patterns.templatemethod;

import org.junit.Test;

import java.io.IOException;

/**
 * 模板方法模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/7
 */
public class TemplateMethodTest {

    @Test
    public void loadMap() throws IOException {
        AbstractResourceLoader loader = new MapResourceLoader();
        loader.load("src/test/resources/map.xml");
    }

    @Test
    public void loadProp() throws IOException {
        AbstractResourceLoader loader = new PropResourceLoader();
        loader.load("src/test/resources/prop.json");
    }

}
