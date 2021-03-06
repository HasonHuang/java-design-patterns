package com.hason.patterns.composite;

/**
 * JSON 内容解析任务（叶子组件）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/9
 */
public class JsonParseTask implements Task {
    @Override
    public boolean canExecute(Object arg) {
        return "json".equals(arg);
    }

    @Override
    public void execute(Object arg) {
        System.out.println("执行JSON解析任务：" + arg);
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
