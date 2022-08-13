package com.yql.design.decorator.impl;

import com.yql.design.decorator.Decorator;
import com.yql.design.decorator.Human;

/**
 * @Package com.yql.design.decorator.impl
 * @ClassName DecoratorFirst
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/13
 */
public class DecoratorFirst extends Decorator {

    public DecoratorFirst(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("去衣柜找找看。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }
}