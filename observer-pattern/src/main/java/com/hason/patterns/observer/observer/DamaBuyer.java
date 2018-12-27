package com.hason.patterns.observer.observer;

import com.hason.patterns.observer.subject.StockData;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 大妈买家（具体观察者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
public class DamaBuyer implements Buyer {

    /**
     * 股票代码与最后价格的关系表
     */
    private final Map<String, BigDecimal> lastPriceMap = new ConcurrentHashMap<>();

    @Override
    public void update(StockData data) {
        BigDecimal lastPrice = lastPriceMap.putIfAbsent(data.getCode(), data.getPrice());
        lastPrice = lastPrice != null ? lastPrice : BigDecimal.ZERO;
        if (lastPrice.compareTo(data.getPrice()) > 0) {
            System.out.println("大妈：哟，买菜钱不见了，赶紧打电话问问股神。");
        } else {
            System.out.println("大妈：终于赚到钱买菜啦");
        }
    }

}
