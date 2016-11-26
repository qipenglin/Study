package com.qipeng.rxjava;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * Created by QiPeng on 2016/9/17.
 */
public class RxJavaTest {
    public static void main(String[] args) {

        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    subscriber.onNext(i);
                }
                subscriber.onCompleted();
            }
        }).subscribe(new Observer<Integer>() {

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("Item is " + item);
            }
        });
    }
}
