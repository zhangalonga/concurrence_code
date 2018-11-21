package forkJoinPool.test7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/21
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final MyTask task = new MyTask(1, 10);
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("结果值为" + pool.submit(task).get());
    }
}
