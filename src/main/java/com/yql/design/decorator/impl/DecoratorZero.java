package com.yql.design.decorator.impl;

import com.yql.design.decorator.Decorator;
import com.yql.design.decorator.Human;

/**
 * @Package com.yql.design.decorator.impl
 * @ClassName DecoratorZero
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/13
 */
public class DecoratorZero extends Decorator {

    public DecoratorZero(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("进房子。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }
}