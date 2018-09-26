package ThreadPoolExecutor.test10;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/26
 */
public class Test {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("打印了！begin" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    System.out.println("打印了！end" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, Integer.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(r);
        System.out.println("A=" + executor.isShutdown());
        executor.shutdown();
        System.out.println("B=" + executor.isShutdown());


    }
}
