/*
 * Copyright 2017 - 2018 探物科技 All Rights Reserved
 */
package com.hason.patterns.proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 用户购买道具的记录表
 *
 * @author Huanghs
 * @since 1.0
 * @date 2019/1/17
 */
public class UserPropTable {

    private static final Map<Prop, Set<User>> TABLE = new HashMap<>();

    public synchronized static void buy(User user, Prop prop) {
        Set<User> users = TABLE.get(prop);
        users = users != null ? users : new HashSet<>();
        users.add(user);
        TABLE.put(prop, users);
    }

    public synchronized static boolean isBelong(Prop prop, User user) {
        Set<User> users = TABLE.get(prop);
        return users != null && users.contains(user);
    }

}
