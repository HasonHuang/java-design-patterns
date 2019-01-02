package com.hason.patterns.command.receiver;

/**
 * 信号弹（接收者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/2
 */
public class SignalBomb {

    public void action() {
        System.out.println("~~~~冒气信号烟雾~~~~");
    }

    public void revoke() {
        System.out.println("停止信号烟雾!!!");
    }

}
