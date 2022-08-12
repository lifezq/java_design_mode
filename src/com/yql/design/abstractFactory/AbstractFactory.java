package com.yql.design.abstractFactory;

/**
 * @Package com.yql.design.abstractFactory
 * @ClassName AbstractFactory
 * @Description 抽象工厂方法，一个工厂类用来实例多个不同产品等级。跟工厂方法区别是，工厂方法一个工厂只生产一个产品，而抽象工厂方法生产多个
 * @Author lifez
 * @Date 2022/5/13
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
