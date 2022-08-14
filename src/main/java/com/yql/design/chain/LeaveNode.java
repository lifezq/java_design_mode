package com.yql.design.chain;

/**
 * @Package com.yql.design.chain
 * @ClassName LeaveNode
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class LeaveNode {
    /**
     * 请假天数
     **/
    private int number;

    /**
     * 请假人
     **/
    private String person;

    public LeaveNode(String person, int number) {
        this.person = person;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}