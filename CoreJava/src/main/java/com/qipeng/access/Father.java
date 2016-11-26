package com.qipeng.access;

/**
 * Created by QiPeng on 2016/11/20.
 */
public class Father extends Object {
    private String pri;
    protected String pro;
    String def;
    public String pub;

    private String getPri() {
        return pri;
    }

    private void setPri(String pri) throws CloneNotSupportedException {
        this.pri = pri;
        clone();
    }

    protected String getPro() {
        return pro;
    }

    protected void setPro(String pro) {
        this.pro = pro;
    }

    String getDef() {
        return def;
    }

    void setDef(String def) {
        this.def = def;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        super.clone();
//    }
}
