/*
 * Copyright 2017 - 2018 探物科技 All Rights Reserved
 */
package com.hason.patterns.proxy.jdk;

import com.hason.patterns.proxy.Prop;
import com.hason.patterns.proxy.User;
import com.hason.patterns.proxy.UserLoginTable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * （JDK 动态代理）保证用户已经登录才能操作道具
 *
 * @author Huanghs
 * @since 1.0
 * @date 2019/1/17
 */
public class ProxyLoginInvocationHandler implements InvocationHandler {

    /** 持有一个主题，主题操作将会委托给具体主题 */
    protected Prop prop;

    public ProxyLoginInvocationHandler(Prop prop) {
        this.prop = prop;
    }

    /**
     * 生成一个代理类
     */
    public Prop newProxy() {
        return (Prop) Proxy.newProxyInstance(
                prop.getClass().getClassLoader(),
                new Class[] { Prop.class },
                this
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!UserLoginTable.isLogin((User) args[0])) {
            throw new UnsupportedOperationException("请先登录");
        }
        return method.invoke(prop, args);
    }
}
