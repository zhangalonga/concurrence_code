package scheduledExecutorService.test9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/20
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        final MyRunnable runnable = new MyRunnable("A");
        final ScheduledFuture<?> scheduledFuture = executor.schedule(runnable, 0, TimeUnit.SECONDS);
        Thread.sleep(3000);
        System.out.println(scheduledFuture.cancel(true));
        System.out.println("main end!");
    }
}
