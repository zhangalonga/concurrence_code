package forkJoinPool.test21;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/26
 */
public class MyTask extends RecursiveTask<String> {
    @Override
    protected String compute() {
        return "我是返回值";
    }
}
