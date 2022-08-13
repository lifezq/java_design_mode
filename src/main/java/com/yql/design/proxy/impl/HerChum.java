package com.yql.design.proxy.impl;

import com.yql.design.proxy.BeautifulGirl;
import com.yql.design.proxy.GiveGift;

/**
 * @Package com.yql.design.proxy.impl
 * @ClassName HerChum
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class HerChum implements GiveGift {

    You you;

    public HerChum(BeautifulGirl mm) {
        you = new You(mm);
    }

    @Override
    public void giveBook() {
        you.giveBook();
    }

    @Override
    public void giveChocolate() {
        you.giveChocolate();
    }

    @Override
    public void giveFlowers() {
        you.giveFlowers();
    }
}