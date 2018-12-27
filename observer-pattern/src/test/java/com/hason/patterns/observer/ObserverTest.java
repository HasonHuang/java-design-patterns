package com.hason.patterns.observer;

import com.hason.patterns.observer.jdk.AppleStock;
import com.hason.patterns.observer.jdk.FundManagerBuyer;
import com.hason.patterns.observer.observer.Buyer;
import com.hason.patterns.observer.observer.DamaBuyer;
import com.hason.patterns.observer.observer.EngineerBuyer;
import com.hason.patterns.observer.subject.ITStock;
import com.hason.patterns.observer.subject.Stock;
import com.hason.patterns.observer.subject.StockData;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 观察者模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
public class ObserverTest {

    @Test
    public void customObserver() {
        // 初始化市场
        Buyer engineer = new EngineerBuyer();
        Buyer dama = new DamaBuyer();
        // 新股上市
        Stock it = new ITStock("IT股");
        // 买入股票
        it.buy(engineer);
        it.buy(dama);

        // 股市波动
        it.renewData(StockData.builder().price(new BigDecimal("10")).build());
        it.renewData(StockData.builder().price(new BigDecimal("12.00")).build());
        it.renewData(StockData.builder().price(new BigDecimal("12.05")).build());
        it.renewData(StockData.builder().price(new BigDecimal("9.90")).build());
    }

    @Test
    public void jdkObserver() {
        FundManagerBuyer fundManagerBuyer = new FundManagerBuyer();
        AppleStock apple = new AppleStock("Apple");
        apple.addObserver(fundManagerBuyer);

        // 股市波动
        apple.renewData(StockData.builder().price(new BigDecimal("10")).build());
        apple.renewData(StockData.builder().price(new BigDecimal("12.00")).build());
        apple.renewData(StockData.builder().price(new BigDecimal("12.05")).build());
        apple.renewData(StockData.builder().price(new BigDecimal("9.90")).build());
    }

}
