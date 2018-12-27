package com.hason.patterns.strategy.context;


import com.hason.patterns.strategy.strategy.WeaponBehavior;

/**
 * 吃鸡玩家，环境角色
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/20
 */
public class Player {

    /**
     * 每个玩家都拥有一个武器，使用组合的方式使用武器
     */
    private WeaponBehavior weaponBehavior;

    /**
     * 装备玩家的武器
     */
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    /**
     * 玩家使用武器
     */
    public void useWeapon() {
        weaponBehavior.useWeapon();
    }
}
