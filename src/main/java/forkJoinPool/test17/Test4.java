package forkJoinPool.test17;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/22
 */
public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        final MyRunnable2 runnable2 = new MyRunnable2();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable2);
        Thread.sleep(1000);
        pool.shutdownNow();
        pool.execute(runnable2);
        System.out.println("main end ");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
