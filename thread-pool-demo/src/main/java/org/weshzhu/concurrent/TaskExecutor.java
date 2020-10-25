package org.weshzhu.concurrent;

/**
 * @author fmj
 */
public class TaskExecutor implements Runnable{

    private int taskIndex;

    public TaskExecutor(int taskIndex) {
        this.taskIndex = taskIndex;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("this is task executor index->" + taskIndex);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
