package com.yql.design.utils;

import java.util.ArrayDeque;

/**
 * @Package com.yql.design.utils
 * @ClassName UtilTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/5/15
 */
public class UtilTest {
    public static void main(String[] args) {
        int initCapacity = 8;
        initCapacity = initCapacity >>> 1;
        System.out.printf("initCapacity >>> 1: %d\n", initCapacity);
        initCapacity = initCapacity >>> 2;
        System.out.printf("initCapacity >>> 2: %d\n", initCapacity);
        initCapacity = initCapacity >>> 4;
        System.out.printf("initCapacity >>> 4: %d\n", initCapacity);

        initCapacity = 8;
        initCapacity |= (initCapacity >>> 1);
        System.out.printf("|=initCapacity >>> 1: %d\n", initCapacity);
        initCapacity |= (initCapacity >>> 2);
        System.out.printf("|=initCapacity >>> 2: %d\n", initCapacity);
        initCapacity |= (initCapacity >>> 4);
        System.out.printf("|=initCapacity >>> 4: %d\n", initCapacity);

        
        ArrayDeque q = new ArrayDeque();
    }
}
