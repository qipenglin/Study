package com.qipeng.operator;

import com.qipeng.domain.Community;
import com.qipeng.domain.House;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by QiPeng on 2016/9/18.
 */
public class FlatMapTest {
    public static void main(String[] args) {

        Community[] communities = {};

        Observable.from(communities)
                .subscribe(new Action1<Community>() {
                    @Override
                    public void call(Community community) {
                        for (House house : community.houses) {
                            System.out.println("House price : " + house.price);
                        }
                    }
                });

        Observable.from(communities)
                .flatMap(new Func1<Community, Observable<House>>() {
                    @Override
                    public Observable<House> call(Community community) {
                        return Observable.from(community.houses);
                    }
                })
                .subscribe(new Action1<House>() {
                    @Override
                    public void call(House house) {
                        System.out.println("House price : " + house.price);
                    }
                });
    }
}
