package com.yql.design.chain;

/**
 * @Package com.yql.design.chain
 * @ClassName Leader
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public abstract class Leader {
    /**
     * 姓名
     **/
    public String name;

    /**
     * 后继者
     **/
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveNode LeaveNode);
}