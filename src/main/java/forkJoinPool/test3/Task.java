package forkJoinPool.test3;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class Task extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName() + "执行compute方法");
        String s = null;
        s.toString();
        return 100;
    }
}
