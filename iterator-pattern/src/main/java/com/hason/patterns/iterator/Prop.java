package com.hason.patterns.iterator;

import lombok.Builder;
import lombok.Data;

/**
 * 道具
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/8
 */
@Data
@Builder
public class Prop {

    private int id;
    private String name;

}
