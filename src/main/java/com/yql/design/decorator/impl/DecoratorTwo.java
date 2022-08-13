package com.yql.design.decorator.impl;

import com.yql.design.decorator.Decorator;
import com.yql.design.decorator.Human;

/**
 * @Package com.yql.design.decorator.impl
 * @ClassName DecoratorTwo
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/13
 */
public class DecoratorTwo extends Decorator {

    public DecoratorTwo(Human human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("找到一件D&G。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }
}