package forkJoinPool.test4;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class MyTaskA extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        try {
            System.out.println(Thread.currentThread().getName() + "beginA" + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "  endA" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }
}
