package com.yql.design.factoryMethod;

import com.yql.design.factoryMethod.impl.GetProductAFactory;

/**
 * @Package com.yql.design.factoryMethod
 * @ClassName TestFactoryMethod
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        GetProductAFactory p = new GetProductAFactory();
        p.getProduct().use();
    }
}
