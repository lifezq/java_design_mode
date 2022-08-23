package com.yql.design.singleton;

/**
 * @Package com.yql.design.singleton
 * @ClassName Person
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/22
 */
public class Person {
    private String name;
    private Integer age;

    private Person() {
        System.out.println("person construct...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
