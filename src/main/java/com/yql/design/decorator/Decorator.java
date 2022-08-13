package com.yql.design.decorator;

/**
 * @Package com.yql.design.decorator.impl
 * @ClassName Decorator
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/13
 */
public abstract class Decorator implements Human {
    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }
}