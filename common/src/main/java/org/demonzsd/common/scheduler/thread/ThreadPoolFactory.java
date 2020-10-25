package org.demonzsd.common.scheduler.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author weshzhu
 */
public class ThreadPoolFactory {
    /**
     * 计算密集型，cpu core 数 + 1
     * IO密集型，cpu core数 * 2
     */
    private final static int MAX_POOL_SIZE = Runtime.getRuntime().availableProcessors() *2;
    private final static int CORE_POOL_SIZE = 4;
    private final static long KEEP_ALIVE_TIME = 3;
    private static BlockingDeque<Runnable> queue = new LinkedBlockingDeque<>();
    private static ThreadPoolExecutor threadPoolExecutor;
    private static AtomicInteger index = new AtomicInteger(1);

    static {
        threadPoolExecutor = new ThreadPoolExecutor(
                CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, queue, r -> {
                    String threadName = "pool-thread-" + index.getAndIncrement();
                    System.out.printf("The thead name is %s%n", threadName);
                    Thread thread = new Thread(r, threadName);
                    if (thread.isDaemon()) {
                        thread.setDaemon(false);
                    }
                    if (thread.getPriority() != Thread.NORM_PRIORITY) {
                        thread.setPriority(Thread.NORM_PRIORITY);
                    }
                    return thread;
                }
        );
    }

    public static void submit(Runnable task){
        threadPoolExecutor.submit(task);
    }
    public static void submit(Callable task){
        threadPoolExecutor.submit(task);
    }


}
