package com.yql.design.strategy.impl;

import com.yql.design.strategy.Strategy;

/**
 * @Package com.yql.design.strategy.impl
 * @ClassName BackDoor
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class BackDoor implements Strategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}