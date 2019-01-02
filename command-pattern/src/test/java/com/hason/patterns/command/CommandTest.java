package com.hason.patterns.command;

import com.hason.patterns.command.command.KnifeCommand;
import com.hason.patterns.command.command.SignalBombCommand;
import com.hason.patterns.command.receiver.Map;
import org.junit.Test;

/**
 * 命令模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/2
 */
public class CommandTest {

    @Test
    public void sendCommand() {
        Player player = new Player();
        player.setCommand(new KnifeCommand());
        player.action();

        player.setCommand(new SignalBombCommand(new Map.Location(1, 2)));
        player.action();
        player.rollback();
    }
}
