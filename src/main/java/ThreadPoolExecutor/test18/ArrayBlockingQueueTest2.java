package ThreadPoolExecutor.test18;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/8
 */
public class ArrayBlockingQueueTest2 {
    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue<Runnable>(2);
        System.out.println(queue.size());
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        System.out.println(executor.getPoolSize() + "  " + queue.size());
    }
}
