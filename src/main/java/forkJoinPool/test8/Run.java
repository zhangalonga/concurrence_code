package forkJoinPool.test8;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/21
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(new MyTask());
        Thread.sleep(5000);
    }
}
