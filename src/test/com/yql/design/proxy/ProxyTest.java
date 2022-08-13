package com.yql.design.proxy;

import com.yql.design.proxy.impl.HerChum;
import org.junit.jupiter.api.Test;

/**
 * @Package com.yql.design.proxy
 * @ClassName ProxyTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class ProxyTest {
    
    @Test
    public void testProxy() {
        BeautifulGirl mm = new BeautifulGirl("小屁孩...");

        HerChum chum = new HerChum(mm);

        chum.giveBook();
        chum.giveChocolate();
        chum.giveFlowers();
    }
}
