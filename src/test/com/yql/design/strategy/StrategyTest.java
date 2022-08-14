package com.yql.design.strategy;

import com.yql.design.strategy.impl.BackDoor;
import com.yql.design.strategy.impl.BlackEnemy;
import com.yql.design.strategy.impl.GivenGreenLight;
import org.junit.jupiter.api.Test;

/**
 * @Package com.yql.design.strategy
 * @ClassName StrategyTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class StrategyTest {
    @Test
    public void testStrategy() {
        Context context;

        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        context.setStrategy(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        context.setStrategy(new BlackEnemy());
        context.operate();
        System.out.println("\n");
    }
}
