package forkJoinPool.test20;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/26
 */
public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        final MyRunnable runnable = new MyRunnable();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable);
        pool.shutdown();
        System.out.println(System.currentTimeMillis());
        System.out.println(pool.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS) + " " + System.currentTimeMillis() + "全部任务执行完毕！");
        System.out.println(System.currentTimeMillis());
    }
}
