package com.qipeng.access;

/**
 * Created by QiPeng on 2016/11/20.
 */
public class Son extends Father {

    public void test() throws CloneNotSupportedException {

        super.getPri();
        super.getPro();
        super.getDef();
        super.getPub();

        super.clone();
        Father f = new Father();
        f.pri = "";
        f.pro = "";
        f.def = "";
        f.pub = "";
        f.clone();//protect的方法只允许直接子类访问，不允许子类的子类访问

        Son s = new Son();
        s.clone();

        Class a = int.class;
        Class b = Integer.TYPE;
        boolean bo = Integer.class == Integer.TYPE;

    }
}
