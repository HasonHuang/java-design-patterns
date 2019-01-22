package com.hason.patterns.prototype;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 地图资源加载器
 *
 * @author Huanghs
 * @since 2.0
 * @date 2019/1/19
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapResourceLoader {

    private final Map<Class<? extends MapResource>, MapResource> TABLE = new ConcurrentHashMap<>();

    public static class MapResourceLoaderHolder {
        static MapResourceLoader INSTANCE = new MapResourceLoader();
    }

    /**
     * Initialization On Demand Holder
      */
    public static MapResourceLoader getInstance() {
        return MapResourceLoaderHolder.INSTANCE;
    }

    /**
     * 添加具体原型对象与类对象的映射关系
     */
    public <T extends MapResource>  void map(Class<T> clazz, MapResource<T> prototype) {
        TABLE.put(clazz, prototype);
    }

    /**
     * 创建一个新的对象
     */
    @SuppressWarnings("unchecked")
    public <T extends MapResource> MapResource<T> get(Class<T> clazz) {
        return (MapResource<T>) TABLE.get(clazz).clone();
    }

}
