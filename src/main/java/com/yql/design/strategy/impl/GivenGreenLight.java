package com.yql.design.strategy.impl;

import com.yql.design.strategy.Strategy;

/**
 * @Package com.yql.design.strategy.impl
 * @ClassName GivenGreenLight
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class GivenGreenLight implements Strategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}