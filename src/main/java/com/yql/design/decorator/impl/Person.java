package com.yql.design.decorator.impl;

import com.yql.design.decorator.Human;

/**
 * @Package com.yql.design.decorator.impl
 * @ClassName Person
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/13
 */
public class Person implements Human {

    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }
}