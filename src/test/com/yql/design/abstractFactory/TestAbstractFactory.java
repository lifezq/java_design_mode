package com.yql.design.abstractFactory;

import com.yql.design.abstractFactory.impl.FactoryProduct1;
import com.yql.design.abstractFactory.impl.FactoryProduct2;

/**
 * @Package com.yql.design.abstractFactory
 * @ClassName TestAbstractFactory
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        FactoryProduct1 f1 = new FactoryProduct1();
        f1.createProductA().use();
        f1.createProductB().use();

        FactoryProduct2 f2 = new FactoryProduct2();
        f2.createProductA().use();
        f2.createProductB().use();
    }
}
