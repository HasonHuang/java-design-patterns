package com.hason.patterns.state;

import org.junit.Test;

/**
 * 状态模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/14
 */
public class StateTest {

    // 正确行为
    @Test
    public void actual() {
        VehicleContext context = VehicleContext.create(10);
        context.drive(7);
        context.drive(4);
        context.repair();
        context.refuel(20);
        context.drive(5);
    }

    // 错误行为
    @Test(expected = UnsupportedOperationException.class)
    public void errorRepair() {
        VehicleContext context = VehicleContext.create(10);
        context.drive(7);
        context.repair();
    }

    // 错误行为
    @Test(expected = UnsupportedOperationException.class)
    public void errorLack() {
        VehicleContext context = VehicleContext.create(10);
        context.drive(7);
        context.drive(3);
        context.drive(1);
    }

}
