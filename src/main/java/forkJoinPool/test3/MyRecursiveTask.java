package forkJoinPool.test3;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        System.out.println("compute time" + System.currentTimeMillis());
        return 100;
    }
}
