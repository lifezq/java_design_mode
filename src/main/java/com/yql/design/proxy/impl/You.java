package com.yql.design.proxy.impl;

import com.yql.design.proxy.BeautifulGirl;
import com.yql.design.proxy.GiveGift;

/**
 * @Package com.yql.design.proxy.impl
 * @ClassName You
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class You implements GiveGift {
    BeautifulGirl mm;     //美女

    public You(BeautifulGirl mm) {
        this.mm = mm;
    }


    @Override
    public void giveBook() {
        System.out.println(mm.getName() + ",送你一本书....");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + ",送你一盒巧克力....");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ",送你一束花....");
    }
}