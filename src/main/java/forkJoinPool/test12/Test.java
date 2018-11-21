package forkJoinPool.test12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/21
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("begin" + System.currentTimeMillis());
        final ForkJoinTask submit = pool.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("ThreadName=" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(submit.get());
        System.out.println("end" + System.currentTimeMillis());
        Thread.sleep(5000);
    }
}
