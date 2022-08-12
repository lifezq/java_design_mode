package com.yql.design.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Package com.yql.design.utils
 * @ClassName WaitTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/6/1
 */
public class WaitTest {
    private static Logger log = LogManager.getLogger(WaitTest.class);

    public static void main(String[] args) {
        SynchronousQueue q = new SynchronousQueue();
        Object lock = new Object();
        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                log.info("获取了锁");
                try {
                    System.out.println("休眠一会儿");
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("调用wait..");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                log.info("被唤醒");
            }
        }, "A");
        threadA.start();

        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                log.info("获得了锁");

                log.info("叫醒A");
                lock.notify();
            }
        }, "B");
        threadB.start();
    }
}