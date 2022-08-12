package com.yql.design.singleton;

/**
 * @Package com.yql.design
 * @ClassName SingleTonTest
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public class SingleTonTest {

    public static void main(String[] args) {
        SingleTon singleTon;
        for (int i = 0; i < 10; i++) {
            singleTon = SingleTon.getInstance();
            System.out.println(System.identityHashCode(singleTon));
        }
    }
}
