package com.hason.patterns.templatemethod;

/**
 * 地图地缘加载器（具体子类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/7
 */
public class MapResourceLoader extends AbstractResourceLoader {
    @Override
    protected String parse(byte[] bytes) {
        return new String(bytes);
    }
}
