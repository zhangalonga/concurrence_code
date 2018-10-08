package ThreadPoolExecutor.test15;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/8
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(4, 5, 5, TimeUnit.SECONDS, new SynchronousQueue<>());
        executor.allowCoreThreadTimeOut(true);
        System.out.println(executor.allowsCoreThreadTimeOut());
        for (int i = 0; i < 4; i++) {
            MyRunnable runnable = new MyRunnable();
            executor.execute(runnable);
        }
        Thread.sleep(8000);
        System.out.println(executor.getPoolSize());
    }
}
