package com.qipeng.domain;

/**
 * Created by QiPeng on 2016/9/18.
 */
public class Sms {
    private Long smsId;

    private Long sendTime;

    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }
}
