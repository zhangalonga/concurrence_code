package forkJoinPool.test2;


import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/20
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(new MyRecursiveAction(1, 10));
        Thread.sleep(5000);
    }
}
