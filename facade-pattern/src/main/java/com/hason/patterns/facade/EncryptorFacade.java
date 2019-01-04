package com.hason.patterns.facade;

import com.hason.patterns.facade.subsystem.FileInputSystem;
import com.hason.patterns.facade.subsystem.FileOutputSystem;
import com.hason.patterns.facade.subsystem.UserInfoOperateSystem;

import java.io.IOException;

/**
 * 加解密的外观类（抽象外观的实现类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/4
 */
public class EncryptorFacade implements Facade {

    /** 读取文件的子系统 */
    private FileInputSystem inputSystem = new FileInputSystem();
    /** 操作用户信息的子系统 */
    private UserInfoOperateSystem infoOperateSystem = new UserInfoOperateSystem();
    /** 写入文件的子系统 */
    private FileOutputSystem outputSystem = new FileOutputSystem();

    @Override
    public void save(String path, String content) {
        try {
            // 1. 读取文件
            String original = inputSystem.read(path);
            // 2. 添加内容
            String newContent = infoOperateSystem.add(original, content);
            // 3. 写入文件
            outputSystem.write(path, newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
