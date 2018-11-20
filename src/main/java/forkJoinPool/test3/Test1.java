package forkJoinPool.test3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final MyRecursiveTask task = new MyRecursiveTask();
        System.out.println(task.hashCode());
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> task1 = pool.submit(task);
        System.out.println(task1.hashCode() + " " + task1.get());
        Thread.sleep(5000);
    }
}
