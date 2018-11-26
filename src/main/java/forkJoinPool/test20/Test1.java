package forkJoinPool.test20;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/26
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        final MyRunnable runnable = new MyRunnable();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable);
        System.out.println("main begin" + System.currentTimeMillis());
        System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
        System.out.println("main end " + System.currentTimeMillis());
    }
}
