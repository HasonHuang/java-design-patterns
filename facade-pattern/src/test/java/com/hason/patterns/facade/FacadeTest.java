package com.hason.patterns.facade;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * 外观模式 Unit Test
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/4
 */
public class FacadeTest {

    @Test
    public void useFacade() {
        // 客户端在运行时决定具体的外观类
        Facade facade = new EncryptorFacade();
        // 通过统一接口操作用户数据
        facade.save("src/test/resources/userinfo", "now: " + LocalDateTime.now().toString());
    }

}
