package com.yql.design.building;

import com.yql.design.building.impl.MealA;

/**
 * @Package com.yql.design.building
 * @ClassName BuildingTest
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public class BuildingTest {
    
    public static void main(String[] args) {
        //套餐A
        MealA a = new MealA();
        //服务员准备套餐A

        //获得套餐
        Meal mealA = MealBuilder.MyMealBuilder.setBuilder(a).build();

        System.out.print("套餐A的组成部分:");
        System.out.println(mealA.getFood() + "---" + mealA.getDrink());
    }
}
