package com.hason.patterns.state;

import lombok.Getter;
import lombok.Setter;

/**
 * 交通工具上下文（上下文、环境类）
 *
 * 由于实际上会有多重交通工具，可以抽象出交通工具类
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/13
 */
@Getter
@Setter
public class VehicleContext {

    /** 当前状态 */
    private State current;
    /** 剩余燃料 */
    private int remainingFuel = 10;

    private VehicleContext(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public static VehicleContext create(int remainingFuel) {
        // 使用工厂模式避免不安全的发布（逸出）
        VehicleContext context = new VehicleContext(remainingFuel);
        context.setState(new NormalState(context));
        return context;
    }

    public void setState(State state) {
        this.current = state;
    }

    public void drive(int fuelConsumption) {
        current.drive(fuelConsumption);
    }

    public void repair() {
        current.repair();
    }

    public void refuel(int fuelConsumption) {
        current.refuel(fuelConsumption);
    }
}
