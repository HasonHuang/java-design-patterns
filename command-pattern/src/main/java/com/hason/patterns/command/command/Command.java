package com.hason.patterns.command.command;

/**
 * 抽象命令类
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/2
 */
public interface Command {

    /**
     * 执行命令
     *
     * @param arg 参数
     */
    void execute(Object arg);

    /**
     * 撤销命令
     */
    void undo();

}
