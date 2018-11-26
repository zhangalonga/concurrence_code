package forkJoinPool.test22;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/26
 */
public class Run1_1 {
    public static void main(String[] args) {
        final MyTask task = new MyTask();
        final MyTask task1 = new MyTask();
        final MyTask task2 = new MyTask();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(task);
        pool.submit(task1);
        pool.submit(task2);
        System.out.println("并行数=" + pool.getParallelism() + "线程池大小=" + pool.getPoolSize());
        pool.shutdown();
        do {

        } while (!pool.isTerminated());
        System.out.println("main end!");
    }
}
