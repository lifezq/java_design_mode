package com.yql.design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Package com.yql.design.singleton
 * @ClassName SingletonUltimate
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/17
 */
public enum EnumSingle {
    INSTANCE;

    private volatile static SingleTon instance;

    public static SingleTon getInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        if (instance == null) {

            synchronized (EnumSingle.class) {
                if (instance == null) {
                    Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor(null);
                    constructor.setAccessible(true);
                    instance = constructor.newInstance();
                }
            }
        }
        return instance;
    }

    public SingleTon getMyInstance() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return getInstance();
    }
}
