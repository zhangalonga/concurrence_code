package ThreadPoolExecutor.test18;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/9
 */
public class SynchronousQueueTest2 {
    public static void main(String[] args) {
        SynchronousQueue<Runnable> queue = new SynchronousQueue<>();
        System.out.println(queue.size());
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        System.out.println(executor.getPoolSize() + "笨蛋" + queue.size());
    }
}
