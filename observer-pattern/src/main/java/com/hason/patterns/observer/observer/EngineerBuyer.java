package com.hason.patterns.observer.observer;


import com.hason.patterns.observer.subject.StockData;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 程序猿股票买家（具体观察者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
public class EngineerBuyer implements Buyer {

    /**
     * 股票代码与最后价格的关系表
     */
    private final Map<String, BigDecimal> lastPriceMap = new ConcurrentHashMap<>();

    @Override
    public void update(StockData data) {
        BigDecimal lastPrice = lastPriceMap.putIfAbsent(data.getCode(), data.getPrice());
        lastPrice = lastPrice != null ? lastPrice : BigDecimal.ZERO;
        if (lastPrice.compareTo(data.getPrice()) > 0) {
            System.out.println("程序猿：艾玛，一个月工资又没了，赶紧放掉股票：" + data.getCode());
        } else {
            System.out.println("程序猿：爽歪歪，今天赚到钱不用敲代码");
        }
    }

}
