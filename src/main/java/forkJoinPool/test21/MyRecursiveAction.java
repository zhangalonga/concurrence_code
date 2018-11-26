package forkJoinPool.test21;

import java.util.concurrent.RecursiveAction;

/**
 * created by zhangalong on 2018/11/26
 */
public class MyRecursiveAction extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.println("ThreadName=" + Thread.currentThread().getName());
    }
}
