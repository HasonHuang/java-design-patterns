package com.hason.patterns.proxy.jdk;

import com.hason.patterns.proxy.Prop;
import com.hason.patterns.proxy.User;
import com.hason.patterns.proxy.UserPropTable;

import java.lang.reflect.Method;

/**
 * （JDK 动态代理）保证用户已经登录且购买，才能操作道具
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/17
 */
public class ProxyOwnerInvocationHandler extends ProxyLoginInvocationHandler {

    public ProxyOwnerInvocationHandler(Prop prop) {
        super(prop);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        User user = (User) args[0];
        String methodName = method.getName();
        switch (methodName) {
            case "useBy":
                if (!UserPropTable.isBelong(prop, user)) {
                    throw new UnsupportedOperationException("请先购买");
                }
            default:
                UserPropTable.buy(user, prop);
        }
        return super.invoke(proxy, method, args);
    }
}
