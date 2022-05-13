package com.yql.design.abstractFactory.impl;

import com.yql.design.abstractFactory.AbstractProductB;

/**
 * @Package com.yql.design.abstractFactory.impl
 * @ClassName ProductB1
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void use() {
        System.out.println("ProductB1 use...");
    }
}
