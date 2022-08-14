package com.yql.design.chain.impl;

import com.yql.design.chain.Leader;
import com.yql.design.chain.LeaveNode;

/**
 * @Package com.yql.design.chain.impl
 * @ClassName Instructor
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class Instructor extends Leader {

    public Instructor(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        if (LeaveNode.getNumber() <= 3) {   //小于3天辅导员审批
            System.out.println("辅导员" + name + "审批" + LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        } else {     //否则传递给系主任
            if (this.successor != null) {
                this.successor.handleRequest(LeaveNode);
            }
        }
    }

}