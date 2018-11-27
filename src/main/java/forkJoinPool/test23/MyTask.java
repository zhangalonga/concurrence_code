package forkJoinPool.test23;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/27
 */
public class MyTask extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        try {
            Thread.sleep(1000);
            Integer.parseInt("s");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw e;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }
}
