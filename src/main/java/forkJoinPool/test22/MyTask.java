package forkJoinPool.test22;

import java.util.concurrent.RecursiveAction;

/**
 * created by zhangalong on 2018/11/26
 */
public class MyTask extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.println("begin=" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            System.out.println("end=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
