package ThreadPoolExecutor.test9;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/26
 */
public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        Runnable1 runnable1 = new Runnable1();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        Thread.sleep(1000);
        executor.shutdownNow();
    }
}
