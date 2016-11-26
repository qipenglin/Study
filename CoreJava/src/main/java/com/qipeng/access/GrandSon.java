package com.qipeng.access;

/**
 * Created by QiPeng on 2016/11/26.
 */
public class GrandSon extends Son {
    public void test() {
        Father f = new Father();
        f.pro = "";
        f.getPro();
    }
}
