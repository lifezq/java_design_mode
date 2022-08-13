package com.yql.design.template.impl;

import com.yql.design.template.AbstractPerson;

/**
 * @Package com.yql.design.template.impl
 * @ClassName Student
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class Student extends AbstractPerson {
    @Override
    protected void dressUp() {
        System.out.println("穿校服");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("吃妈妈做好的早饭");
    }

    @Override
    protected void takeThings() {
        System.out.println("背书包，带上家庭作业和红领巾");
    }
}