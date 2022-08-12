package com.yql.design.staticFactory;

/**
 * @Package com.yql.design.staticFactory
 * @ClassName TestStaticFactory
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/13
 */
public class TestStaticFactory {
    public static void main(String[] args) {
        Product p = ProductFactory.getProduct("A");
        p.use();
    }
}
