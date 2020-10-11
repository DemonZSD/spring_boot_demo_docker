package org.weshzhu.concurrent;

/**
 * @author fmj
 */
public class TaskExecutor implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("this is task executor");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
