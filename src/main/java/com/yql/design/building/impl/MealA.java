package com.yql.design.building.impl;

import com.yql.design.building.MealBuilder;

/**
 * @Package com.yql.design.building.impl
 * @ClassName MealA
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public class MealA extends MealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }

    @Override
    public void buildFood() {
        meal.setFood("一盒薯条");
    }

}