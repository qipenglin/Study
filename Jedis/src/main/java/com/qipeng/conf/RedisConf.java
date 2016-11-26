package com.qipeng.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * Created by QiPeng on 2016/9/18.
 */
@Configuration
public class RedisConf {

    @Bean
    @ConfigurationProperties(prefix = "redis")
    public Jedis jedis() {

        return new Jedis();
    }


}
