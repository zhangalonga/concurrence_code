package forkJoinPool.test8;

import java.util.concurrent.RecursiveAction;

/**
 * created by zhangalong on 2018/11/21
 */
public class MyTask extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.println("ThreadName=" + Thread.currentThread().getName());
    }
}
