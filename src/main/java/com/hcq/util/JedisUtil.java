package com.hcq.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.io.Serializable;

/**
 * fileName:JedisUtil
 * description:
 * author:hcq
 * createTime:2019-03-03 8:05
 */
@Component
public class JedisUtil {
    @Autowired
    JedisCluster jedis;
    //取数据
    /*   public  String get(String key){
          return jedis.get(key);
       }*/
       public Object get(Object key){
            if(jedis.get(SerializeUtil.serializable(key))!=null){
                return SerializeUtil.unserializable(jedis.get(SerializeUtil.serializable(key)));
           }
           return null;
       }
    //添数据
       public void put(String key,String value) {
        jedis.set(key,value);
       }
       public void put(Object key,Object object){
           jedis.set(SerializeUtil.serializable(key),SerializeUtil.serializable(object));
       }
    //删数据
}
