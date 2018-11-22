package forkJoinPool.test19;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/22
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("打印了！begin" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    System.out.println("打印了！end" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable);
        System.out.println("A=" + pool.isShutdown());
        pool.shutdown();
        Thread.sleep(5000);
        System.out.println("B=" + pool.isShutdown());
    }
}
