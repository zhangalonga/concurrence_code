package scheduledExecutorService.test7;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/16
 */
public class Run1 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        final MyRunnable myRunnable = new MyRunnable("A");
        final MyRunnable myRunnable1 = new MyRunnable("B");
        executor.schedule(myRunnable, 3, TimeUnit.SECONDS);
        executor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        executor.shutdown();
        System.out.println("已经shutdown了");
    }
}
