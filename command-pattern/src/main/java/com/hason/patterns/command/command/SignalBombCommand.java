package com.hason.patterns.command.command;

import com.hason.patterns.command.receiver.Map;
import com.hason.patterns.command.receiver.SignalBomb;

/**
 * 信号弹命令（宏命令）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/2
 */
public class SignalBombCommand implements Command {

    private SignalBomb signalBomb = new SignalBomb();
    private Map map;

    public SignalBombCommand(Map.Location location) {
        this.map = new Map(location);
    }

    @Override
    public void execute(Object arg) {
        // 这里的 arg 仅仅用于展示 execute 方法可以携带参数值
        // 显示信号烟雾
        signalBomb.action();
        // 然后显示位置信息
        map.show();
    }

    @Override
    public void undo() {
        // 取消信号烟雾
        signalBomb.revoke();
        map.hide();
    }
}
