package scheduledExecutorService.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/13
 */
public class Run {
    public static void main(String[] args) {
        List<Runnable> list = new ArrayList<>();
        list.add(new MyRunnableA());
        list.add(new MyRunnableB());
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        System.out.println("x = " + System.currentTimeMillis());
        executor.schedule(list.get(0), 0L, TimeUnit.SECONDS);
        executor.schedule(list.get(1), 0L, TimeUnit.SECONDS);
        System.out.println("Y = " + System.currentTimeMillis());
    }
}
