package forkJoinPool.test16;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/22
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        final MyRunnable runnable = new MyRunnable();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(runnable);
        Thread.sleep(1000);
        pool.shutdown();
        System.out.println("main end");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
