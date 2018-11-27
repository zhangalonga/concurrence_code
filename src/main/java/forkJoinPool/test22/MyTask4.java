package forkJoinPool.test22;

import java.util.concurrent.RecursiveAction;

/**
 * created by zhangalong on 2018/11/27
 */
public class MyTask4 extends RecursiveAction {
    private int i = 0;

    @Override
    protected void compute() {
        System.out.println("beginA" + Thread.currentThread().getName());
        while (i < 100000) {
            String s = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println("endA=" + Thread.currentThread().getName());
    }
}
