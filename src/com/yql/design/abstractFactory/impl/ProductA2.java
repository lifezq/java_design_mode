package com.yql.design.abstractFactory.impl;

import com.yql.design.abstractFactory.AbstractProductA;

/**
 * @Package com.yql.design.abstractFactory.impl
 * @ClassName ProductA2
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class ProductA2 extends AbstractProductA {
    @Override
    public void use() {
        System.out.println("ProductA2 use...");
    }
}
