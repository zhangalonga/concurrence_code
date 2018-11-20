package forkJoinPool.test1;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/20
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(new MyRecursiveAction());
        Thread.sleep(5000);
    }
}
