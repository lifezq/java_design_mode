package com.yql.design.observer.impl;

import com.yql.design.observer.DisplayElement;
import com.yql.design.observer.Observer;
import com.yql.design.observer.Subject;

/**
 * @Package com.yql.design.observer.impl
 * @ClassName CurrentConditionsDisplay
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);      //注册观察者
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity and" +
                pressure + " pressure");
    }

}