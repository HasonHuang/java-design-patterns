package com.hason.patterns.composite;

/**
 * 任务（抽象组件）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/9
 */
public interface Task {

    /**
     * 判断是否可执行任务
     */
    boolean canExecute(Object arg);

    /**
     * 执行任务
     */
    void execute(Object arg);


    // 下面是透明组合模式的方法

    /**
     * 添加子组件
     */
    void add(Task task);

    /**
     * 删除子组件
     */
    void remove(Task task);

    /**
     * 获取子组件
     */
    Task getChild(int i);

}
