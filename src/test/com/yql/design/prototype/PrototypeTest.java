package com.yql.design.prototype;

import com.yql.design.prototype.impl.DeepClonePrototype;

/**
 * @Package com.yql.design.prototype
 * @ClassName PrototypeTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/12
 */
public class PrototypeTest {
    public static void main(String[] args) {
        DeepClonePrototype deepClonePrototype = new DeepClonePrototype();
        deepClonePrototype.list.add("a");
        deepClonePrototype.list.add("b");
        System.out.println(System.identityHashCode(deepClonePrototype) + ":" + deepClonePrototype.list);
        DeepClonePrototype deepCloned = (DeepClonePrototype) deepClonePrototype.clone();
        System.out.println(System.identityHashCode(deepCloned) + ":" + deepCloned.list + ":" + (deepCloned.list == deepClonePrototype.list));
    }
}
