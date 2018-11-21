package forkJoinPool.test14;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/21
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        final UserInfo info = new UserInfo();
        final MyRunnable runnable = new MyRunnable(info);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(runnable, info);
        Thread.sleep(2000);
        System.out.println("name=" + info.getUsername());
        Thread.sleep(2000);
    }
}
