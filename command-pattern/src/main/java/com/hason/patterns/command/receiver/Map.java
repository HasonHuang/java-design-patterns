package com.hason.patterns.command.receiver;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 地图对象（接收者）
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/2
 */
@AllArgsConstructor
public class Map {

    private Location location;

    /**
     * 经纬度
     */
    @Data
    @AllArgsConstructor
    public static class Location {
        private double lon;
        private double lat;
    }

    public void show() {
        System.out.println("您的队友请求帮助，位置：经度 " + location.getLon() + "，纬度 " + location.getLat());
    }

    public void hide() {
        System.out.println("隐藏并清除位置信息");
        location = null;
    }

}
