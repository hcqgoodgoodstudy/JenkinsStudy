package com.hcq.util;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

/**
 * fileName:RedisPool
 * description:
 * author:hcq
 * createTime:2019-03-03 8:15
 */
/*@Component//单机redis连接池*/
public class RedisPool extends JedisPool {
    public RedisPool(@Autowired GenericObjectPoolConfig poolConfig, @Value("192.168.96.20") String host,@Value("6379") int port) {
        super(poolConfig, host, port);
    }
 }
