package com.qipeng.web;

import com.qipeng.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by QiPeng on 2016/9/19.
 */
@RestController
public class SmsController {
    @Autowired
    private SmsService smsService;

    @ResponseBody
    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello";
    }


}
