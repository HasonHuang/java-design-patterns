package com.hason.patterns.observer.subject;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 * IT股（具体的目标类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
@AllArgsConstructor
public class ITStock extends Stock {


    /**
     * 最后一次通知买家时的股票价格，用于判断股票价格变化幅度是否大于 5%
     */
    private static volatile BigDecimal lastNotifyPrice = BigDecimal.ZERO;
    /**
     * 变化幅度
     */
    private static final BigDecimal RANGE = new BigDecimal("0.05");

    /**
     * 股票代码
     */
    private String code;

    @Override
    public void renewData(StockData data) {
        data.setCode(code);
        System.out.println("### 股市 " + code + " 报价： " + data.getPrice());
        // 只有股票变化幅度大于 5% 时才通知
        BigDecimal diff = data.getPrice().subtract(lastNotifyPrice).abs();
        if (RANGE.multiply(lastNotifyPrice).compareTo(diff) <= 0) {
            setChanged();
            lastNotifyPrice = data.getPrice();
        }
        notifyBuyers(data);
    }
}
