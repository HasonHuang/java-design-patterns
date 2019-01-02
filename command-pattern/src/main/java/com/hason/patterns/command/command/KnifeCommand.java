package com.hason.patterns.command.command;

import com.hason.patterns.command.receiver.Knife;

/**
 * 匕首指令（具体命令类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/2
 */
public class KnifeCommand implements Command {

    private Knife knife = new Knife();

    @Override
    public void execute(Object arg) {
        knife.attack();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("不支持撤销匕首操作");
    }

}
