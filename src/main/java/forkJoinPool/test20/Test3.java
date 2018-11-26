package forkJoinPool.test20;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/26
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        final MyRunnable1 runnable1 = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable1);
        pool.shutdown();
        System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS) + System.currentTimeMillis());
        System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS) + System.currentTimeMillis());
    }
}
