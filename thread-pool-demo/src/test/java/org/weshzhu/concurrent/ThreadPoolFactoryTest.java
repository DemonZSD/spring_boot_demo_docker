package org.weshzhu.concurrent;

public class ThreadPoolFactoryTest {

    public static void main(String[] args) {
        System.out.println("start");
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        ThreadPoolFactory.submit(new TaskExecutor());
        System.out.println("end");

    }

}