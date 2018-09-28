package ThreadPoolExecutor.test13;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/28
 */
public class Test2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.setThreadFactory(new ThreadFactory());
        executor.execute(runnable);
    }
}
