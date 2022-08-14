package com.yql.design.strategy;

/**
 * @Package com.yql.design.strategy
 * @ClassName Context
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class Context {
    private Strategy strategy;

    //构造函数，要你使用哪个妙计
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}