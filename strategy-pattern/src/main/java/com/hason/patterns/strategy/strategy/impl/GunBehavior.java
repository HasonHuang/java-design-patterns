package com.hason.patterns.strategy.strategy.impl;

import com.hason.patterns.strategy.strategy.WeaponBehavior;

/**
 * 枪支，武器的具体策略
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/20
 */
public class GunBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("枪支攻击");
    }

}
