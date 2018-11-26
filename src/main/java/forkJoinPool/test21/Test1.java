package forkJoinPool.test21;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/26
 */
public class Test1 {
    public static void main(String[] args) {
        final MyRecursiveAction action = new MyRecursiveAction();
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(action);
    }
}
