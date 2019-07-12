package com.group8.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisutilImpl implements JedisUtil {

    @Autowired
    private JedisPool jedis;

    @Override
    public void putObject(Object key, Object value) {
        Jedis resource = jedis.getResource();
        resource.set(SerializeUtil.serialize(key.toString()),
                SerializeUtil.serialize(value));
        resource.close();
    }

    @Override
    public Object removeObject(Object arg0) {
        Jedis resource = jedis.getResource();
        Object expire = resource.expire(
                SerializeUtil.serialize(arg0.toString()), 0);
        resource.close();
        return expire;
    }

    @Override
    public Object getObject(Object arg0) {
        Jedis resource = jedis.getResource();
        Object value = SerializeUtil.unserialize(resource.get(
                SerializeUtil.serialize(arg0.toString())));
        resource.close();
        return value;
    }
}
