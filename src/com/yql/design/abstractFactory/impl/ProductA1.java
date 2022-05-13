package com.yql.design.abstractFactory.impl;

import com.yql.design.abstractFactory.AbstractProductA;

/**
 * @Package com.yql.design.abstractFactory.impl
 * @ClassName ProductA
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class ProductA1 extends AbstractProductA {
    @Override
    public void use() {
        System.out.println("ProductA1 use...");
    }
}
