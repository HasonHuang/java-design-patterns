package com.hason.patterns.state;

import lombok.AllArgsConstructor;

/**
 * 缺燃料状态（具体状态类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/13
 */
@AllArgsConstructor
public class LackState implements State {

    /** 上下文 */
    private VehicleContext context;

    @Override
    public void drive(int fuelConsumption) {
        throw new UnsupportedOperationException("没有足够的燃料");
    }

    @Override
    public void repair() {
        throw new UnsupportedOperationException("只是缺少燃料，无需维修！");
    }

    @Override
    public void refuel(int fuelConsumption) {
        context.setRemainingFuel(context.getRemainingFuel() + fuelConsumption);
        System.out.println("添加燃料: " + context.getRemainingFuel());
        changeState();
    }

    @Override
    public void changeState() {
        if (context.getRemainingFuel() > 0) {
            context.setState(new LackState(context));
        }
    }
}
