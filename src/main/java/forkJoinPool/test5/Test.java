package forkJoinPool.test5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        final MyRecursiveTask task = new MyRecursiveTask(1, 20);
        final ForkJoinTask<String> submit = pool.submit(task);
        System.out.println(submit.join());
        Thread.sleep(5000);
    }
}
