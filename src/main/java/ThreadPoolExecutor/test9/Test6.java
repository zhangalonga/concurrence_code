package ThreadPoolExecutor.test9;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/26
 */
public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        Runnable2 runnable1 = new Runnable2();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        Thread.sleep(1000);
        executor.shutdownNow();
        System.out.println("main end");
    }
}
