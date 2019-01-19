package com.hason.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 动物资源（具体原型类）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/19
 */
@Data
@Slf4j
public class AnimalMapResource implements MapResource<AnimalMapResource>, Cloneable {

    private static final AtomicLong COUNTER = new AtomicLong(1);

    /** 唯一标识 */
    private Long id;
    /** 名字 */
    private String name;

    public AnimalMapResource(Long id, String name) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
    }

    @Override
    public AnimalMapResource clone() {
        try {
            // 实际场景中需要注意浅克隆or深克隆
            AnimalMapResource resource = (AnimalMapResource) super.clone();
            resource.setId(COUNTER.getAndIncrement());
            return resource;
        } catch (CloneNotSupportedException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }
}
