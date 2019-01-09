package com.hason.patterns.composite;

/**
 * 处理文件的任务（叶子组件）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/9
 */
public class FileTask implements Task {
    @Override
    public boolean canExecute(Object arg) {
        return arg != null;
    }

    @Override
    public void execute(Object arg) {
        System.out.println("执行文件任务：" + arg);
    }

    @Override
    public void add(Task task) {
        throw new UnsupportedOperationException("add");
    }

    @Override
    public void remove(Task task) {
        throw new UnsupportedOperationException("remove");
    }

    @Override
    public Task getChild(int i) {
        throw new UnsupportedOperationException("getChild");
    }
}

