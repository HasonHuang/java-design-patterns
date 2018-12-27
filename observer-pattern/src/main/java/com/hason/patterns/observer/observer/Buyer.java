package com.hason.patterns.observer.observer;

import com.hason.patterns.observer.subject.StockData;

/**
 * 股票买家（观察者，对观察目标的改变做出反应）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
public interface Buyer {

    /**
     * 接收股票数据
     *
     * @param data 股票数据
     */
    void update(StockData data);

}
