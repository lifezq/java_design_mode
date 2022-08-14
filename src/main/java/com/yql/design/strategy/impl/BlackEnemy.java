package com.yql.design.strategy.impl;

import com.yql.design.strategy.Strategy;

/**
 * @Package com.yql.design.strategy.impl
 * @ClassName BlackEnemy
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class BlackEnemy implements Strategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}