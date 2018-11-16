package scheduledExecutorService.test8;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/16
 */
public class Run1 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        final MyRunnable myRunnable = new MyRunnable("A");
        executor.scheduleAtFixedRate(myRunnable, 1, 2, TimeUnit.SECONDS);
        executor.setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
        executor.shutdown();
        System.out.println("已经shutdown了");
    }
}
