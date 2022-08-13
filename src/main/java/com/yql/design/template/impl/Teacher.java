package com.yql.design.template.impl;

import com.yql.design.template.AbstractPerson;

/**
 * @Package com.yql.design.template.impl
 * @ClassName Teacher
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class Teacher extends AbstractPerson {
    @Override
    protected void dressUp() {
        System.out.println("穿工作服");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("做早饭，照顾孩子吃早饭");
    }

    @Override
    protected void takeThings() {
        System.out.println("带上昨晚准备的考卷");
    }
}