package forkJoinPool.test10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/21
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final MyTask task = new MyTask();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(task);
        System.out.println(System.currentTimeMillis());
        System.out.println(task.get());
        System.out.println(System.currentTimeMillis());
        Thread.sleep(5000);
    }
}
