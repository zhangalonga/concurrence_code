package ThreadPoolExecutor.test12;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/28
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 runnable2 = new MyRunnable2();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(1, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable2);
        executor.execute(runnable2);
        executor.execute(runnable2);
        executor.execute(runnable2);
        executor.shutdown();
        System.out.println("A =" + executor.awaitTermination(1, TimeUnit.SECONDS) + "" + System.currentTimeMillis());
        System.out.println("B =" + executor.awaitTermination(1, TimeUnit.SECONDS) + "" + System.currentTimeMillis());
        System.out.println("C =" + executor.awaitTermination(1, TimeUnit.SECONDS) + "" + System.currentTimeMillis());
        System.out.println("D =" + executor.awaitTermination(1, TimeUnit.SECONDS) + "" + System.currentTimeMillis());
        System.out.println("E =" + executor.awaitTermination(1, TimeUnit.SECONDS) + "" + System.currentTimeMillis());
        System.out.println("F =" + executor.awaitTermination(1, TimeUnit.SECONDS) + "" + System.currentTimeMillis());
        System.out.println("G =" + executor.awaitTermination(1, TimeUnit.SECONDS) + "" + System.currentTimeMillis());
    }
}
