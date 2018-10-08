package ThreadPoolExecutor.test17;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/8
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("打印了" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());


    }
}
