package com.yql.design.adapter;

import com.yql.design.adapter.impl.Adapter;
import com.yql.design.adapter.impl.ConcreteTarget;

/**
 * @Package com.yql.design.adapter
 * @ClassName AdapterTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/12
 */
public class AdapterTest {
    
    public static void main(String[] args) {
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();
    }
}
