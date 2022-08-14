package com.yql.design.observer;

import com.yql.design.observer.impl.CurrentConditionsDisplay;
import com.yql.design.observer.impl.WeatherData;
import org.junit.jupiter.api.Test;

/**
 * @Package com.yql.design.observer
 * @ClassName ObserverTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class ObserverTest {
    @Test
    public void testObserver() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 78, 40.4f);
    }
}
