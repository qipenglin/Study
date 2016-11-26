package com.qipeng.stream;

/**
 * Created by QiPeng on 2016/9/17.
 */
public class Shape {
    String color;
    int weight;

    Shape(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
