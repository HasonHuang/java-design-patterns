package com.hason.patterns.command;

import com.hason.patterns.command.command.Command;
import lombok.Data;
import lombok.Setter;

/**
 * 游戏玩家（调用者，请求发送者）
 *
 * 这个例子把请求发送者与调用者分离了，实际上服务器端才是调用者
 * 一般情况下，命令模式中的调用者同时是请求发送者，如 {@link #rollback()} 所示
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/2
 */
@Setter
public class Player {

    private Command command;

    public void action() {
        // 执行命令
        command.execute(null);
    }

    public void rollback() {
        command.undo();
    }

}
