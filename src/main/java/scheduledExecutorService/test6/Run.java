package scheduledExecutorService.test6;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/16
 */
public class Run {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        final MyRunnable A = new MyRunnable("A");
        final MyRunnable B = new MyRunnable("B");
        final MyRunnable C = new MyRunnable("C");
        final MyRunnable D = new MyRunnable("D");
        final MyRunnable E = new MyRunnable("E");
        System.out.println(A.hashCode());
        System.out.println(B.hashCode());
        System.out.println(C.hashCode());
        System.out.println(D.hashCode());
        System.out.println(E.hashCode());
        executor.scheduleAtFixedRate(A, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(B, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(C, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(D, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(E, 10, 2, TimeUnit.SECONDS);
        System.out.println("");
        final BlockingQueue<Runnable> queue = executor.getQueue();
        final Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Runnable runnable = iterator.next();
            System.out.println("队列中的：" + runnable);
        }
    }
}
