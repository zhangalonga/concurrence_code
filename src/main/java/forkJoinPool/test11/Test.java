package forkJoinPool.test11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/21
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final MyTask task = new MyTask();
        ForkJoinPool pool = new ForkJoinPool();
        final ForkJoinTask<String> submit = pool.submit(task);
        System.out.println("begin" + System.currentTimeMillis());
        System.out.println(submit.get());
        System.out.println("end" + System.currentTimeMillis());
    }
}
