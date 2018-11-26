package forkJoinPool.test21;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/26
 */
public class Test2 {
    public static void main(String[] args) {
        final MyTask task = new MyTask();
        ForkJoinPool pool = new ForkJoinPool();
        final String s = pool.invoke(task);
        System.out.println(s);
    }
}
