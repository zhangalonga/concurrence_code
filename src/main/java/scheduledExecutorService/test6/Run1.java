package scheduledExecutorService.test6;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/16
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        final MyRunnable A = new MyRunnable("A");
        final MyRunnable B = new MyRunnable("B");


        final ScheduledFuture<?> future = executor.scheduleAtFixedRate(A, 0, 2, TimeUnit.SECONDS);
        Thread.sleep(1000);
        final ScheduledFuture<?> future1 = executor.scheduleAtFixedRate(B, 10, 2, TimeUnit.SECONDS);
        Thread.sleep(5000);

        System.out.println(executor.remove((Runnable) future1));
        System.out.println("");
        final BlockingQueue<Runnable> queue = executor.getQueue();
        final Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Runnable runnable = iterator.next();
            System.out.println("队列中的：" + runnable);
        }
    }
}
