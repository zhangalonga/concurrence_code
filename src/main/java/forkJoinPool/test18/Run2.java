package forkJoinPool.test18;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/22
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
                    String s = new String();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                }
            }
        };
        ForkJoinPool pool = new ForkJoinPool();
        final ForkJoinTask<?> task = pool.submit(runnable);
        Thread.sleep(500);
        System.out.println("A=" + pool.isTerminating());
        pool.shutdownNow();
        System.out.println("B=" + pool.isTerminating());
        System.out.println(task.get());
        Thread.sleep(1000);
        System.out.println("C=" + pool.isTerminated());
    }
}
