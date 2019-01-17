/*
 * Copyright 2017 - 2018 探物科技 All Rights Reserved
 */
package com.hason.patterns.proxy;

import java.util.HashSet;
import java.util.Set;

/**
 * 登录用户的记录表
 *
 * @author Huanghs
 * @since 1.0
 * @date 2019/1/17
 */
public class UserLoginTable {

    /** 已经登录的用户 */
    private static final Set<User> USERS = new HashSet<>();

    public synchronized static void login(User user) {
        USERS.add(user);
    }

    public synchronized static void logout(User user) {
        USERS.remove(user);
    }

    public synchronized static boolean isLogin(User user) {
        return USERS.contains(user);
    }

}
