package forkJoinPool.test9;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/21
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadName=" + Thread.currentThread().getName());
            }
        });
        Thread.sleep(5000);
    }
}
