package com.hason.patterns.state;

import lombok.AllArgsConstructor;

/**
 * 故障状态（具体状态类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/14
 */
@AllArgsConstructor
public class FaultState implements State {

    /** 上下文 */
    private VehicleContext context;

    @Override
    public void drive(int fuelConsumption) {
        throw new UnsupportedOperationException("车辆故障");
    }

    @Override
    public void repair() {
        System.out.println("维修完成");
        changeState();
    }

    @Override
    public void refuel(int fuelConsumption) {
        // 只是加油不足以修复工具
        context.setRemainingFuel(context.getRemainingFuel() + fuelConsumption);
    }

    @Override
    public void changeState() {
        if (context.getRemainingFuel() == 0) {
            // 如果没有油，表示缺油
            context.setState(new LackState(context));
        }
        // 否则进入正常模式
        context.setState(new NormalState(context));
    }
}
