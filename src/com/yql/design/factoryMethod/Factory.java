package com.yql.design.factoryMethod;

/**
 * @Package com.yql.design.factoryMethod
 * @ClassName Factory
 * @Description 工厂方法模式，一个工厂对应一个产品
 * @Author lifez
 * @Date 2022/5/13
 */
public interface Factory {
    /**
     * get product
     *
     * @return Product
     */
    Product getProduct();
}
