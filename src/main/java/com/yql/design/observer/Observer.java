package com.yql.design.observer;

/**
 * @Package com.yql.design.observer
 * @ClassName Observer
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}