package com.yql.design.adapter.impl;

import com.yql.design.adapter.Adaptee;
import com.yql.design.adapter.Target;

/**
 * @Package com.yql.design.adapter.impl
 * @ClassName Adapter
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/12
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
