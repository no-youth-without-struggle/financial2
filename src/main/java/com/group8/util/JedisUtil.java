package com.group8.util;

public interface JedisUtil {
//    放入缓存
    void putObject(Object key, Object value);
//    清除缓存
    Object removeObject(Object arg0);
//    从缓存中取出
    Object getObject(Object arg0);
}
