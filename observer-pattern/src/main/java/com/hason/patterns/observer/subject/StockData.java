package com.hason.patterns.observer.subject;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 股票数据
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
@Builder
@Data
public class StockData {

    /**
     * 股票代码
     */
    private String code;
    /**
     * 当前价格
     */
    private BigDecimal price;
    /**
     * 成交量
     */
    private Long volumes;

}
