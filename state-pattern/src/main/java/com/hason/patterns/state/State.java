package com.hason.patterns.state;

/**
 * 交通工具状态（抽象状态类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/13
 */
public interface State {

    /**
     * 驾驶
     *
     * @param fuelConsumption 油耗
     */
    void drive(int fuelConsumption);

    /**
     * 维修
     */
    void repair();

    /**
     * 加燃料
     *
     * @param fuelConsumption 燃料量
     */
    void refuel(int fuelConsumption);

    /**
     * 改变状态
     */
    void changeState();

}
