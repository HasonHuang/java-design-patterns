package com.hason.patterns.iterator;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 迭代器 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/8
 */
public class IteratorTest {

    @Test
    public void iterator() {
        Resources<Prop> resources = new PropResources(
                Prop.builder().id(1).name("道具1").build(),
                Prop.builder().id(2).name("道具2").build(),
                Prop.builder().id(3).name("道具3").build(),
                Prop.builder().id(4).name("道具4").build(),
                Prop.builder().id(5).name("道具5").build()
        );
        PageIterator<Prop> iterator = resources.iterator();
        // 每页展示 2 个元素
        int pageSize = 2;
        assertThat(iterator.hasNext(pageSize)).isTrue();
        while (iterator.hasNext(pageSize)) {
            System.out.println(Arrays.asList(iterator.next(pageSize).toArray(new Prop[0])));
        }
        // 剩余不足一页的，全部展示
        assertThat(iterator.hasRemain()).isTrue();
        System.out.println(Arrays.asList(iterator.remain().toArray(new Prop[0])));
    }

}
