package com.yql.design.factoryMethod.impl;

import com.yql.design.factoryMethod.Product;

/**
 * @Package com.yql.design.factoryMethod.impl
 * @ClassName ProductA
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class ProductA implements Product {
    @Override
    public void use() {
        System.out.println("Product A use...");
    }
}
