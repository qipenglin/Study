package com.qipeng.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by QiPeng on 2016/9/17.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<Shape>();
        shapes.add(new Shape("red", 2));
        shapes.add(new Shape("blue", 4));
        shapes.add(new Shape("red", 5));
        shapes.add(new Shape("blue", 6));
        shapes.add(new Shape("blue", 3));
        shapes.add(new Shape("red", 7));
        int blueWeight = shapes.stream().filter(s -> s.getColor() == "blue").mapToInt(s -> s.getWeight()).sum();
        Set<Shape> redShapes = shapes.stream().filter(s -> s.getColor().equals("red")).collect(Collectors.toSet());
    }
}
