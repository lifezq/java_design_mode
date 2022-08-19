package com.yql.design.singleton;

/**
 * @Package com.yql.design.singleton
 * @ClassName SingleTon
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public class SingleTon {
    private static boolean reflectLabel = false; // 当反射实例化时，通过该标识锁定，防止反射破坏单例
    private volatile static SingleTon instance;

    private SingleTon() {
        synchronized (SingleTon.class) {
            if (reflectLabel == false) {
                reflectLabel = true;
            } else {
                throw new RuntimeException("不能用反射破坏异常");
            }
        }
    }

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
