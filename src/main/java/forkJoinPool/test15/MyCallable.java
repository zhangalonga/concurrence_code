package forkJoinPool.test15;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/11/21
 */
public class MyCallable implements Callable<String> {

    private long value;

    public MyCallable(long value) {
        this.value = value;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + "sleep" + value + "now time:" + System.currentTimeMillis());
            Thread.sleep(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "我是返回值";
    }
}
