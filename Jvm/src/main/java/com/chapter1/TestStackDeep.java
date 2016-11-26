package com.chapter1;

import java.util.Scanner;

/**
 * Created by QiPeng on 2016/9/16.
 */
public class TestStackDeep {
    public static int count = 1;

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println(count);
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
    }
}
