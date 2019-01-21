package com.hason.patterns.builder;

import lombok.Data;

/**
 * 人物模型（产品角色）
 *
 * @author Huanghs
 * @since 1.0
 * @date 2019/1/21
 */
@Data
public class Model {

    /** 性别 */
    private String sex;

    /** 发型 */
    private String hair;

    /** 衣服 */
    private String clothes;

    /** 鞋子 */
    private String shoe;

    /** 枪支 */
    private String gun;

}
