package org.weshzhu.concurrent;

import org.demonzsd.common.scheduler.thread.ThreadPoolFactory;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolFactoryTest {

    public static void main(String[] args) {
        System.out.println("start");

        for(int i = 0; i< 100 ;i++){
            ThreadPoolFactory.submit(new TaskExecutor(i));
        }
        System.out.println("end");

    }

}
