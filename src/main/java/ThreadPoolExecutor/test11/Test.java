package ThreadPoolExecutor.test11;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/28
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 99999, 99999, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        System.out.println(executor.isTerminating() + "" + executor.isTerminated());
        executor.shutdown();
        Thread.sleep(1000);
        System.out.println(executor.isTerminating() + "" + executor.isTerminated());
        Thread.sleep(1000);
        System.out.println(executor.isTerminating() + "" + executor.isTerminated());
        Thread.sleep(1000);
        System.out.println(executor.isTerminating() + "" + executor.isTerminated());
        Thread.sleep(1000);
        System.out.println(executor.isTerminating() + "" + executor.isTerminated());
        Thread.sleep(1000);
        System.out.println(executor.isTerminating() + "" + executor.isTerminated());


    }
}
