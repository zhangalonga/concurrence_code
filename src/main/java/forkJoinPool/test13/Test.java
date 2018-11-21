package forkJoinPool.test13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/21
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final MyCallable callable = new MyCallable();
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("begin" + System.currentTimeMillis());
        final ForkJoinTask<String> task = pool.submit(callable);
        System.out.println(task.get());
        System.out.println("end" + System.currentTimeMillis());
    }
}
