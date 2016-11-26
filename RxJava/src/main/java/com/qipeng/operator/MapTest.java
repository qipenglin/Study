package com.qipeng.operator;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by QiPeng on 2016/9/18.
 */
public class MapTest {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5).map(new Func1<Integer, String>() {
            @Override
            public String call(Integer i) {
                return "This is " + i;
            }
        }).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        });
    }
}
