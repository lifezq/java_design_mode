package com.yql.design.chain;

import com.yql.design.chain.impl.Dean;
import com.yql.design.chain.impl.DepartmentHead;
import com.yql.design.chain.impl.Instructor;
import com.yql.design.chain.impl.President;
import org.junit.jupiter.api.Test;

/**
 * @Package com.yql.design.chain
 * @ClassName ChainTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class ChainTest {

    @Test
    public void testChain() {
        Leader instructor = new Instructor("陈毅");       //辅导员
        Leader departmentHead = new DepartmentHead("王明");    //系主任
        Leader dean = new Dean("张强");      //院长
        Leader president = new President("王晗");     //校长

        instructor.setSuccessor(departmentHead);       //辅导员的后续者是系主任
        departmentHead.setSuccessor(dean);             //系主任的后续者是院长
        dean.setSuccessor(president);                  //院长的后续者是校长

        //请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三", 3);
        instructor.handleRequest(leaveNode1);

        //请假9天的请假条
        LeaveNode leaveNode2 = new LeaveNode("李四", 9);
        instructor.handleRequest(leaveNode2);

        //请假15天的请假条
        LeaveNode leaveNode3 = new LeaveNode("王五", 15);
        instructor.handleRequest(leaveNode3);

        //请假20天的请假条
        LeaveNode leaveNode4 = new LeaveNode("赵六", 20);
        instructor.handleRequest(leaveNode4);
    }
}
