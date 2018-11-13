package scheduledExecutorService.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/11/13
 */
public class Run2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Callable> list = new ArrayList<>();
        list.add(new MyCallableA());
        list.add(new MyCallableB());
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        ScheduledFuture<String> futureA = executor.schedule(list.get(0), 4L, TimeUnit.SECONDS);
        ScheduledFuture<String> futureB = executor.schedule(list.get(1), 4L, TimeUnit.SECONDS);
        System.out.println("x=" + System.currentTimeMillis());
        System.out.println("返回值A=" + futureA.get());
        System.out.println("返回值B=" + futureB.get());
        System.out.println("y=" + System.currentTimeMillis());
    }
}
