package com.yql.design.abstractFactory.impl;

import com.yql.design.abstractFactory.AbstractFactory;
import com.yql.design.abstractFactory.AbstractProductA;
import com.yql.design.abstractFactory.AbstractProductB;

/**
 * @Package com.yql.design.abstractFactory.impl
 * @ClassName FactoryProductA
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class FactoryProduct1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
