package com.yql.design.building;

/**
 * @Package com.yql.design.building
 * @ClassName MealBuilder
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public abstract class MealBuilder {
    public Meal meal = new Meal();


    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }

    public static class MyMealBuilder {
        private static MealBuilder mealBuilder;

        public static MyMealBuilder setBuilder(MealBuilder builder) {
            mealBuilder = builder;
            return new MyMealBuilder();
        }

        public Meal build() {
            mealBuilder.buildDrink();
            mealBuilder.buildFood();
            return mealBuilder.getMeal();
        }
    }
}