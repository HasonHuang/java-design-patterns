package com.hason.patterns.templatemethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 游戏资源加载器（抽象类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/7
 */
public abstract class AbstractResourceLoader {

    /**
     * （模板方法）加载资源
     */
    public void load(String resourcePath) throws IOException {
        // 读取源文件资源
        byte[] contentBytes = readFile(resourcePath);
        // 解析资源内容
        Object content = parse(contentBytes);
        if (isCustom()) {
            customHandle(content);
        }
        show(content);
    }

    /**
     * （基本方法 - 具体方法）读取文件
     */
    protected byte[] readFile(String resourcePath) throws IOException {
        return Files.readAllBytes(Paths.get(resourcePath));
    }

    /**
     * （基本方法 - 抽象方法）解析资源内容
     */
    protected abstract Object parse(byte[] bytes);

    /**
     * （基本方法 - 钩子方法）是否自定义处理资源内容
     */
    protected boolean isCustom() {
        return true;
    }

    /**
     * （基本方法 - 钩子方法）自定义处理资源内容的方法
     */
    protected void customHandle(Object content) {
    }

    /**
     * （基本方法 - 具体方法）展示资源
     */
    protected void show(Object content) {
        System.out.println("展示文件内容：");
        System.out.println(content);
    }

}
