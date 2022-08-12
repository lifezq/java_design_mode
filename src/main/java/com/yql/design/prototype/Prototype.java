package com.yql.design.prototype;

import java.util.ArrayList;

/**
 * @Package com.yql.design.property
 * @ClassName Property
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/12
 */
public abstract class Prototype implements Cloneable {
    public ArrayList<String> list = new ArrayList<String>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
