package com.yql.design.staticFactory.impl;

import com.yql.design.staticFactory.Product;

/**
 * @Package com.yql.design.staticFactory.impl
 * @ClassName ProductB
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class ProductB implements Product {
    @Override
    public void use() {
        System.out.println("Product B use...");
    }
}
