package com.yql.design.adapter.impl;

import com.yql.design.adapter.Target;

/**
 * @Package com.yql.design.adapter.impl
 * @ClassName ConcreteTarget
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/12
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}

