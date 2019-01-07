package com.hason.patterns.templatemethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * 道具资源加载器（具体子类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/7
 */
public class PropResourceLoader extends AbstractResourceLoader {
    @Override
    protected Object parse(byte[] bytes) {
        ObjectMapper mapper = new ObjectMapper();
        try {

            return mapper.readValue(bytes, new TypeReference<Map<String, Object>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected void customHandle(Object content) {
        // 自定义处理数据内容，增加解析时间
        Map<String, Object> map = (Map<String, Object>) content;
        map.put("parseAt", LocalDateTime.now());
    }
}
