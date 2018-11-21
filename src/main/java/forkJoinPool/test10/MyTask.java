package forkJoinPool.test10;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/21
 */
public class MyTask extends RecursiveTask<String> {
    @Override
    protected String compute() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "我是返回值";
    }
}
