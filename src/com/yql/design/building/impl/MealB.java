package com.yql.design.building.impl;

import com.yql.design.building.MealBuilder;

/**
 * @Package com.yql.design.building.impl
 * @ClassName MealB
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public class MealB extends MealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("一杯柠檬果汁");
    }

    @Override
    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

}
