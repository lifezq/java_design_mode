package com.yql.design.staticFactory;

import com.yql.design.staticFactory.impl.ProductA;
import com.yql.design.staticFactory.impl.ProductB;

/**
 * @Package com.yql.design.staticFactory
 * @ClassName ProductFactory
 * @Description 简单工厂模式，又称静态工厂模式
 * @Author lifez
 * @Date 2022/5/13
 */
public class ProductFactory {
    public static Product getProduct(String s) {
        switch (s) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
