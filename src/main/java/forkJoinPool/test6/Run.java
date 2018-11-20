package forkJoinPool.test6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class Run {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final MyTask task = new MyTask(1, 10);
        ForkJoinPool pool = new ForkJoinPool();
        final ForkJoinTask<Integer> submit = pool.submit(task);
        System.out.println("submit的值为" + submit.get());
    }
}
