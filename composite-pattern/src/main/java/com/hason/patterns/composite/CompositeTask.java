package com.hason.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 复杂的任务，包含多个子任务（容器组件）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/9
 */
@NoArgsConstructor
@AllArgsConstructor
public class CompositeTask implements Task {

    private List<Task> tasks = new ArrayList<>();

    @Override
    public boolean canExecute(Object arg) {
        // 能否执行任务由具体的叶子组件决定
        throw new UnsupportedOperationException("canExecute");
    }

    @Override
    public void execute(Object arg) {
        for (Task task : tasks) {
            task.execute(arg);
        }
    }

    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public void remove(Task task) {
        tasks.remove(task);
    }

    @Override
    public Task getChild(int i) {
        return tasks.get(i);
    }
}
