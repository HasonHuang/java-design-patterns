package com.hason.patterns.proxy;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

/**
 * 保证已经登录了才能操作道具的代理类（静态代理，代理主题）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/17
 */
public class ProxyLoginProp implements Prop {

    /** 主题 */
    @Getter
    private Prop prop;
    /** 记录已经登录的用户 */
    private Set<User> loginUsers = new HashSet<>();

    public ProxyLoginProp(Prop prop) {
        this.prop = prop;
    }

    @Override
    public void acquiredBy(User user) {
        if (!UserLoginTable.isLogin(user)) {
            throw new UnsupportedOperationException("用户未登录");
        }
        UserPropTable.buy(user, prop);
        prop.acquiredBy(user);
    }

    @Override
    public void useBy(User user) {
        if (!UserLoginTable.isLogin(user)) {
            throw new UnsupportedOperationException("用户未登录");
        }
        // 部分道具登录即可使用
        prop.useBy(user);
    }
}
