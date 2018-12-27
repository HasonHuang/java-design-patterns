package com.hason.patterns.singleton;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 单例模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/27
 */
public class SingletonTest {

    @Test
    public void testIODH() {
        IDGenerator generator1 = IDGenerator.get();
        IDGenerator generator2 = IDGenerator.get();
        assertThat(generator1).isSameAs(generator2);
    }
}
