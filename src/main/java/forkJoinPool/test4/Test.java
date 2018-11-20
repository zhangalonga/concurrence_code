package forkJoinPool.test4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        final ForkJoinTask<Integer> taskA = pool.submit(new MyTaskA());
        final ForkJoinTask<Integer> taskB = pool.submit(new MyTaskB());
        System.out.println("准备打印" + System.currentTimeMillis());
        System.out.println(taskA.join() + " A:" + System.currentTimeMillis());
        System.out.println(taskB.join() + " B:" + System.currentTimeMillis());
        Thread.sleep(5000);
    }
}
