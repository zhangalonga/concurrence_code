package forkJoinPool.test17;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/22
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        final MyRunnable1 runnable1 = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(runnable1);
        Thread.sleep(2000);
        pool.shutdownNow();
        System.out.println("main end!");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
