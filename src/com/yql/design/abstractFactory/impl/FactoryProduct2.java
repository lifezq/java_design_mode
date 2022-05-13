package com.yql.design.abstractFactory.impl;

import com.yql.design.abstractFactory.AbstractFactory;
import com.yql.design.abstractFactory.AbstractProductA;
import com.yql.design.abstractFactory.AbstractProductB;

/**
 * @Package com.yql.design.abstractFactory.impl
 * @ClassName FactoryProduct2
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class FactoryProduct2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
