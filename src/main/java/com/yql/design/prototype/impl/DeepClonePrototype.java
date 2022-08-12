package com.yql.design.prototype.impl;

import com.yql.design.prototype.Prototype;

import java.util.ArrayList;

/**
 * @Package com.yql.design.property.impl
 * @ClassName DeepClonePrototype
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/12
 */
public class DeepClonePrototype extends Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        prototype.list = (ArrayList<String>) this.list.clone();

        return prototype;
    }
}
