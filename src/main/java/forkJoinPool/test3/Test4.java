package forkJoinPool.test3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class Test4 {
    public static void main(String[] args) {
        final Task task = new Task();
        ForkJoinPool pool = new ForkJoinPool();
        final ForkJoinTask<Integer> submit = pool.submit(task);
        System.out.println(submit.join());
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String s = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println("main end");
    }
}
