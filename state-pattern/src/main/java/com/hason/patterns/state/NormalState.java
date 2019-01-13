package com.hason.patterns.state;

import lombok.AllArgsConstructor;

/**
 * 正常模式（具体状态类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/13
 */
@AllArgsConstructor
public class NormalState implements State {

    /** 上下文 */
    private VehicleContext context;

    @Override
    public void drive(int fuelConsumption) {
        context.setRemainingFuel(context.getRemainingFuel() - fuelConsumption);
        System.out.println("开始驾驶中...剩余燃料：" + context.getRemainingFuel());
        changeState();
    }

    @Override
    public void repair() {
        throw new UnsupportedOperationException("一切正常，无需维修！");
    }

    @Override
    public void refuel(int fuelConsumption) {
        context.setRemainingFuel(context.getRemainingFuel() + fuelConsumption);
        // 如果“排空”油箱，则油量置为 0
        context.setRemainingFuel(context.getRemainingFuel() < 0 ? 0 : context.getRemainingFuel());
        System.out.println("添加燃料: " + context.getRemainingFuel());
        changeState();
    }

    @Override
    public void changeState() {
        if (context.getRemainingFuel() == 0) {
            context.setState(new LackState(context));
            System.out.println("燃料已用完");
        } else if (context.getRemainingFuel() < 0) {
            // 油箱小于 0 时会故障
            System.out.println("消耗过大导致故障");
            context.setState(new FaultState(context));
        }
    }
}
