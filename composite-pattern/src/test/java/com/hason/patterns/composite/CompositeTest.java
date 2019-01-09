package com.hason.patterns.composite;

import org.junit.Test;

import java.util.Arrays;

/**
 * 组合模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/9
 */
public class CompositeTest {

    @Test
    public void composite() {
        Task task = new CompositeTask();
        task.add(new FileTask());
        task.add(new JsonParseTask());
        task.add(new XmlParseTask());

        // 执行任务1
        task.execute("json");
        // 执行任务2
        task.execute("xml");
    }

    @Test
    public void recursiveComposite() {
        Task task = new CompositeTask();
        task.add(new FileTask());
        task.add(new JsonParseTask());
        task.add(new CompositeTask(Arrays.asList(new FileTask(), new JsonParseTask())));

        // 执行任务
        task.execute("json");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void nodeUnsupported() {
        Task task = new FileTask();
        task.add(new JsonParseTask());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void compositeUnsupported() {
        Task task = new CompositeTask();
        task.add(new FileTask());
        task.canExecute("file path");
    }

}
