package com.yql.design.chain.impl;

import com.yql.design.chain.Leader;
import com.yql.design.chain.LeaveNode;

/**
 * @Package com.yql.design.chain.impl
 * @ClassName Dean
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class Dean extends Leader {

    public Dean(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        if (LeaveNode.getNumber() <= 10) {   //小于10天院长审批
            System.out.println("院长" + name + "审批" + LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        } else {     //否则传递给校长
            if (this.successor != null) {
                this.successor.handleRequest(LeaveNode);
            }
        }
    }

}