package com.hason.patterns.iterator;

/**
 * 游戏资源列表（抽象聚合类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/8
 */
public interface Resources<T> {

    /**
     * 创建迭代器
     */
    PageIterator<T> iterator();

}
