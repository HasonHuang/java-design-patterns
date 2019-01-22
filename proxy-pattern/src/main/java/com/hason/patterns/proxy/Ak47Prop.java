package com.hason.patterns.proxy;

/**
 * 枪支道具（具体主题）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/17
 */
public class Ak47Prop implements Prop {

    @Override
    public void acquiredBy(User user) {
        System.out.println(String.format("用户【%s】 成功获取 AK47", user.getName()));
    }

    @Override
    public void useBy(User user) {
        System.out.println(String.format("用户 【%s】 按下了 AK47 扳机", user.getName()));
    }

}
