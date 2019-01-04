package com.hason.patterns.facade.subsystem;

import com.google.common.base.Charsets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 文件写入系统
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/4
 */
public class FileOutputSystem {

    /**
     * 将内容写入到文件中
     *
     * @param path 文件路径
     * @param content 文件内容
     */
    public void write(String path, String content) throws IOException {
        Files.write(Paths.get(path), content.getBytes(Charsets.UTF_8));
    }
}
