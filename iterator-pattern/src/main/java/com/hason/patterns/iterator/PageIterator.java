package com.hason.patterns.iterator;

import java.util.Collection;

/**
 * 逐页迭代器（抽象迭代器）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/8
 */
public interface PageIterator<E> {

    /**
     * 是否有下一页
     *
     * @return true 有， false 没有
     */
    boolean hasNext(int size);

    /**
     * 获取下一页内容
     *
     * @param size 页大小
     * @return 下一页
     */
    Collection<E> next(int size);

    /**
     * 是否有剩余元素
     */
    boolean hasRemain();

    /**
     * 返回全部剩余元素
     */
    Collection<E> remain();

    /**
     * 移除当前页
     */
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
