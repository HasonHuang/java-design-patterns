package com.hason.patterns.observer.jdk;


import com.hason.patterns.observer.subject.StockData;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
public class FundManagerBuyer implements Observer {

    /**
     * 股票代码与最后价格的关系表
     */
    private final Map<String, BigDecimal> lastPriceMap = new ConcurrentHashMap<>();

    @Override
    public void update(Observable o, Object arg) {
        if (!(arg instanceof StockData)) {
            throw new IllegalArgumentException("Unknown data type:" + arg.getClass());
        }
        StockData data = (StockData) arg;
        BigDecimal lastPrice = lastPriceMap.putIfAbsent(data.getCode(), data.getPrice());
        lastPrice = lastPrice != null ? lastPrice : BigDecimal.ZERO;
        if (lastPrice.compareTo(data.getPrice()) > 0) {
            System.out.println("基金经理：唔。。又亏了客户的钱。");
        } else {
            System.out.println("基金经理：赚钱了，真开心");
        }
    }

}
