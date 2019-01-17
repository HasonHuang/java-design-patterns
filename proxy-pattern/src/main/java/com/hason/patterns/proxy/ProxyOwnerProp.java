/*
 * Copyright 2017 - 2018 探物科技 All Rights Reserved
 */
package com.hason.patterns.proxy;

/**
 * 保证已经登录、购买的，才能操作道具的代理类（静态代理，代理主题）
 *
 * @author Huanghs
 * @since 1.0
 * @date 2019/1/17
 */
public class ProxyOwnerProp extends ProxyLoginProp {

    public ProxyOwnerProp(Prop prop) {
        super(prop);
    }

    @Override
    public void acquiredBy(User user) {
        if (!UserLoginTable.isLogin(user)) {
            throw new UnsupportedOperationException("请先登录");
        }
        UserPropTable.buy(user, getProp());
    }

    @Override
    public void useBy(User user) {
        if (!UserLoginTable.isLogin(user)) {
            throw new UnsupportedOperationException("请先登录");
        }
        if (!UserPropTable.isBelong(getProp(), user)) {
            throw new UnsupportedOperationException("请先购买道具");
        }
        getProp().useBy(user);
    }
}
