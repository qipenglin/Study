package com.qipeng.domain;

import java.util.List;

/**
 * Created by QiPeng on 2016/9/18.
 */
public class Community {
    public String name;

    public List<House> houses;

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}
