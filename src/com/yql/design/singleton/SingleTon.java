package com.yql.design.singleton;

/**
 * @Package com.yql.design.singleton
 * @ClassName SingleTon
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public class SingleTon {
    private static SingleTon instance;

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
