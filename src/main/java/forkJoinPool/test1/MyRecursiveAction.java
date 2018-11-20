package forkJoinPool.test1;

import java.util.concurrent.RecursiveAction;

/**
 * created by zhangalong on 2018/11/20
 */
public class MyRecursiveAction extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.println("compute run!");
    }
}
