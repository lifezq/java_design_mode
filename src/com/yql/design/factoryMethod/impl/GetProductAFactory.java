package com.yql.design.factoryMethod.impl;

import com.yql.design.factoryMethod.Factory;
import com.yql.design.factoryMethod.Product;

/**
 * @Package com.yql.design.factoryMethod.impl
 * @ClassName GetProductAFactory
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class GetProductAFactory implements Factory {
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
