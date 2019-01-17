/*
 * Copyright 2017 - 2018 探物科技 All Rights Reserved
 */
package com.hason.patterns.proxy;

import com.hason.patterns.proxy.jdk.ProxyLoginInvocationHandler;
import com.hason.patterns.proxy.jdk.ProxyOwnerInvocationHandler;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

/**
 * 代理模式 Unit Test
 *
 * @author Huanghs
 * @since 1.0
 * @date 2019/1/17
 */
public class ProxyTest {

    // 测试静态代理
    @Test
    public void staticProxy() {
        Prop ak47 = new Ak47Prop();
        User user = new User("hason");

        // --------------- 测试登录代理 -------------------- //
        final Prop ak47Proxy = new ProxyLoginProp(ak47);
        // 测试未登录
        assertThat(ak47Proxy).isNotNull();
        assertThatThrownBy(() -> ak47Proxy.acquiredBy(user)).isInstanceOf(UnsupportedOperationException.class);
        assertThatThrownBy(() -> ak47Proxy.useBy(user)).isInstanceOf(UnsupportedOperationException.class);
        // 测试已登录
        UserLoginTable.login(user);
        ak47Proxy.acquiredBy(user);
        ak47Proxy.useBy(user);

        UserLoginTable.logout(user);

        // --------------- 测试主人代理 -------------------- //
        final Prop ownerProxy = new ProxyOwnerProp(ak47);
        // 测试未登录
        assertThat(ownerProxy).isNotNull();
        assertThatThrownBy(() -> ownerProxy.acquiredBy(user)).isInstanceOf(UnsupportedOperationException.class);
        assertThatThrownBy(() -> ownerProxy.useBy(user)).isInstanceOf(UnsupportedOperationException.class);
        // 测试已登录
        UserLoginTable.login(user);
        ownerProxy.acquiredBy(user);
        ownerProxy.useBy(user);
    }

    // 测试动态代理（JDK 动态代理）
    @Test
    public void dynamicProxy() {
        Prop ak47 = new Ak47Prop();
        User user = new User("hason");

        // --------------- 测试登录代理 -------------------- //
        Prop loginProxy = new ProxyLoginInvocationHandler(ak47).newProxy();
        // 测试未登录
        assertThat(loginProxy).isNotNull();
        assertThatThrownBy(() -> loginProxy.acquiredBy(user)).isInstanceOf(UnsupportedOperationException.class);
        assertThatThrownBy(() -> loginProxy.useBy(user)).isInstanceOf(UnsupportedOperationException.class);
        // 测试已登录
        UserLoginTable.login(user);
        loginProxy.acquiredBy(user);
        loginProxy.useBy(user);

        UserLoginTable.logout(user);

        // --------------- 测试主人代理 -------------------- //
        final Prop ownerProxy = new ProxyOwnerInvocationHandler(ak47).newProxy();
        // 测试未登录
        assertThat(ownerProxy).isNotNull();
        assertThatThrownBy(() -> ownerProxy.acquiredBy(user)).isInstanceOf(UnsupportedOperationException.class);
        assertThatThrownBy(() -> ownerProxy.useBy(user)).isInstanceOf(UnsupportedOperationException.class);
        // 测试已登录
        UserLoginTable.login(user);
        ownerProxy.acquiredBy(user);
        ownerProxy.useBy(user);
    }

}
