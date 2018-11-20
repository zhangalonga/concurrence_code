package forkJoinPool.test4;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class MyTaskB extends RecursiveTask<Integer> {

    @Override
    protected Integer compute() {
        try {
            System.out.println(Thread.currentThread().getName() + "beginB" + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "  endB" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }
}
