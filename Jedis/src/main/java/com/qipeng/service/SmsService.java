package com.qipeng.service;

import com.qipeng.domain.Sms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * Created by QiPeng on 2016/9/18.
 */
@Service
public class SmsService {

    @Autowired
    private Jedis jedis;

    public Long save(Sms sms) {
        return jedis.zadd("sms", Double.valueOf(sms.getSendTime().toString()), sms.getSmsId().toString());
    }

}
