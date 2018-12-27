package com.hason.patterns.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * ID 生成器
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class IDGenerator {

    private AtomicLong lastId = new AtomicLong();

    private IDGenerator() {
    }

    /**
     * 延迟初始化占位类模式，当使用到时 JVM 才加载该内部类
     */
    private static class IDGeneratorHolder {
        private static final IDGenerator generator = new IDGenerator();
    }

    public static IDGenerator get() {
        return IDGeneratorHolder.generator;
    }

}
