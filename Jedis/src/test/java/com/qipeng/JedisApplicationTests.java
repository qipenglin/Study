package com.qipeng;

import com.qipeng.domain.Sms;
import com.qipeng.service.SmsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisApplicationTests {

    @Autowired
    private SmsService smsService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testAdd() {
        Sms sms = new Sms();
        sms.setSendTime((new Date().getTime() + 180000));
        sms.setSmsId(20L);
        smsService.save(sms);
    }
}
