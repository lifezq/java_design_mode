package com.yql.design.flyweight;

import org.junit.jupiter.api.Test;

/**
 * @Package com.yql.design.flyweight
 * @ClassName FlyWeightTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class FlyWeightTest {
    @Test
    public void testFlyWeight() {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();

        System.out.println("一共绘制了" + FlyweightFactory.getSum() + "中颜色的圆形");
    }
}
