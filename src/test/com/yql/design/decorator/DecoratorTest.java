package com.yql.design.decorator;

import com.yql.design.decorator.impl.DecoratorFirst;
import com.yql.design.decorator.impl.DecoratorTwo;
import com.yql.design.decorator.impl.DecoratorZero;
import com.yql.design.decorator.impl.Person;

/**
 * @Package com.yql.design.decorator
 * @ClassName DecoratorTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/13
 */
public class DecoratorTest {
    
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new DecoratorTwo(new DecoratorFirst(new DecoratorZero(person)));
        decorator.wearClothes();
    }
}