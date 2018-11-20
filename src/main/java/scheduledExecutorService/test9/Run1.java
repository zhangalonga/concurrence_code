package scheduledExecutorService.test9;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/16
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        final MyRunnable runnable = new MyRunnable("A");
        final ScheduledFuture<?> scheduledFuture = executor.schedule(runnable, 0, TimeUnit.SECONDS);
        Thread.sleep(2000);
        final BlockingQueue<Runnable> queue = executor.getQueue();
        System.out.println("A处size=" + queue.size());
        System.out.println("取消结果为：" + scheduledFuture.cancel(true));
        final BlockingQueue<Runnable> queue1 = executor.getQueue();
        System.out.println("B处size=" + queue1.size());
        System.out.println("main end");
    }
}
