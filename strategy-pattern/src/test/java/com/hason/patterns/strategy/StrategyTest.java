package com.hason.patterns.strategy;


import com.hason.patterns.strategy.context.Player;
import com.hason.patterns.strategy.strategy.impl.GunBehavior;
import com.hason.patterns.strategy.strategy.impl.KnifeBehavior;
import org.junit.Test;

/**
 * 策略模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/28
 */
public class StrategyTest {

    @Test
    public void use() {
        Player player = new Player();
        // 这里随意切换武器，而无需改变其他行为
        player.setWeaponBehavior(new GunBehavior());
        // 无论更换什么武器，这里仍然不变
        player.useWeapon();
        player.setWeaponBehavior(new KnifeBehavior());
        player.useWeapon();
    }

}
