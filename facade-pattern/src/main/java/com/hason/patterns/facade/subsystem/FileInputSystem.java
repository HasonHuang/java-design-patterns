package com.hason.patterns.facade.subsystem;


import com.google.common.base.Charsets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 简单模拟读取文件的系统
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/4
 */
public class FileInputSystem {

    /**
     * 读取全部文件，转换成字符串
     *
     * @param path 文件路径
     * @return file content
     */
    public String read(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return new String(bytes, Charsets.UTF_8);
    }

}
