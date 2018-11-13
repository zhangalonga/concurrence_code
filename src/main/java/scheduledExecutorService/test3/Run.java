package scheduledExecutorService.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/11/13
 */
public class Run {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Callable> list = new ArrayList<>();
        list.add(new MyCallableA());
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        System.out.println("x=" + System.currentTimeMillis());
        ScheduledFuture<String> s = executor.schedule(list.get(0), 4L, TimeUnit.SECONDS);
        System.out.println(s.get() + "A=" + System.currentTimeMillis());
    }
}
