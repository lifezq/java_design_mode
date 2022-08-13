package com.yql.design.flyweight.impl;

import com.yql.design.flyweight.Shape;

/**
 * @Package com.yql.design.flyweight.impl
 * @ClassName Circle
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class Circle extends Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画了一个" + color + "的圆形");
    }
}