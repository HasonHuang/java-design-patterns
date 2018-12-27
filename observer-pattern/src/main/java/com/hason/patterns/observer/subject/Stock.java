package com.hason.patterns.observer.subject;

import com.hason.patterns.observer.observer.Buyer;
import lombok.Getter;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 股票（目标，也称为主题，被观察的对象）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2018/12/24
 */
public abstract class Stock {

    /**
     * 持有一个股票买家的列表
     */
    private final Set<Buyer> buyers = new CopyOnWriteArraySet<>();
    /**
     * 波幅是否大于 5%
     */
    @Getter
    private volatile boolean changed = false;

    /**
     * 购买股票（注册观察者）
     *
     * @param buyer 股票买家（观察者）
     */
    public void buy(Buyer buyer) {
        buyers.add(buyer);
    }

    /**
     * 卖出股票（注销观察者）
     *
     * @param buyer 股票买家（观察者）
     */
    public void sell(Buyer buyer) {
        buyers.remove(buyer);
    }

    /**
     * 通知股票买家，让其知道股票最新消息
     *
     * @param data 股票数据
     */
    public synchronized void notifyBuyers(StockData data) {
        if (!isChanged()) {
            // 变化幅度小于 5% 不通知
            return;
        }
        clearChanged();
        // 逐个通知买家
        buyers.forEach(buyer -> buyer.update(data));
    }

    public void setChanged() {
        changed = true;
    }

    public void clearChanged() {
        changed = false;
    }

    /**
     * 更新股票数据
     */
    public abstract void renewData(StockData data);

}
