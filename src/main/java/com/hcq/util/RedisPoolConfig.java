package com.hcq.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPoolConfig;

/**
 * fileName:RedisPoolConfig
 * description:
 * author:hcq
 * createTime:2019-03-03 8:08
 */
/*@Component//单机redis连接池配置类*/
public class RedisPoolConfig extends JedisPoolConfig {
    {
         //最大连接数：默认8
         this.setMaxTotal(50);
         //最大空闲链接数：默认8
         this.setMaxIdle(10);
         //设置等待超时时间
         this.setMaxWaitMillis(1000);
         //允许获取一个jedis实例检查连接可用性
         this.setTestOnBorrow(true);
    }
}
