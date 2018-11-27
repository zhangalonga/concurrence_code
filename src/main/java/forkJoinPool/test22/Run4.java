package forkJoinPool.test22;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/27
 */
public class Run4 {
    public static void main(String[] args) throws InterruptedException {
        final MyTask4 task4 = new MyTask4();
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.isQuiescent());
        pool.submit(task4);
        Thread.sleep(1000);
        System.out.println(pool.isQuiescent());
    }
}
