package scheduledExecutorService.test5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/13
 */
public class Run1 {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        System.out.println("x=" + System.currentTimeMillis());
        executor.scheduleWithFixedDelay(new MyRunableB(), 1, 2, TimeUnit.SECONDS);
        System.out.println("Y=" + System.currentTimeMillis());
    }
}
