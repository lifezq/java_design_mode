package com.yql.design.factoryMethod;

/**
 * @Package com.yql.design.factoryMethod
 * @ClassName Factory
 * @Description 工厂方法模式，一个工厂对应一个产品
 * 工厂方法模式是对简单工厂模式的改进，简单工厂的缺陷在于不符合“开闭原则”，
 * 每次添加新产品类就需要修改工厂类，不利于系统的扩展维护。
 * 而工厂方法将工厂抽象化，并定义一个创建对象的接口。每增加新产品，只需增
 * 加该产品以及对应的具体实现工厂类，由具体工厂类决定要实例化的产品是哪个，
 * 将对象的创建与实例化延迟到子类，这样工厂的设计就符合“开闭原则”了，扩展
 * 时不必去修改原来的代码。
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
