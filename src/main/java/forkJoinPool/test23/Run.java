package forkJoinPool.test23;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/27
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyTask task = new MyTask();
        ForkJoinPool pool = new ForkJoinPool();
        final ForkJoinTask<Integer> submit = pool.submit(task);
        System.out.println(submit.isCompletedAbnormally() + " " + submit.isCompletedNormally());
        Thread.sleep(2000);
        System.out.println(submit.isCompletedAbnormally() + " " + submit.isCompletedNormally());
        System.out.println(submit.getException());
    }
}
