package com.hason.patterns.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * 道具资源列表（具体聚合类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/8
 */
public class PropResources implements Resources<Prop> {

    private Prop[] props;

    public PropResources(Prop... props) {
        this.props = props;
    }

    @Override
    public PageIterator<Prop> iterator() {
        return new PropIterator();
    }

    /**
     * 内部迭代器
     */
    private class PropIterator implements PageIterator<Prop> {

        /** 下一次要返回的元素位置 */
        private int cursor;
        /** 最后一个返回的元素位置 */
        private int lastRet;

        @Override
        public boolean hasNext(int size) {
            return (cursor + size) <= props.length;
        }

        @Override
        public Collection<Prop> next(int size) {
            if (size < 1) {
                throw new IllegalArgumentException();
            }

            int i = cursor;
            if ((i + size) > props.length) {
                // 越界
                throw new NoSuchElementException();
            }
            // 移动游标，指向下一次需要返回的元素位置
            cursor = i + size;

            return newCollection(i, size);
        }

        @Override
        public boolean hasRemain() {
            return cursor != props.length;
        }

        @Override
        public Collection<Prop> remain() {
            // 计算出剩余的元素数量
            int size = props.length - cursor;
            return newCollection(cursor, size);
        }

        private Collection<Prop> newCollection(int current, int size) {
            Collection<Prop> collection = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                current += j;
                collection.add(props[lastRet = current]);
            }
            return collection;
        }

    }
}
