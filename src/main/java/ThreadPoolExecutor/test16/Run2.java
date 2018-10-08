package ThreadPoolExecutor.test16;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/8
 */
public class Run2 {
    public static void main(String[] args) {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了！begin" + Thread.currentThread().getName());
                    Thread.sleep(4000);
                    System.out.println("打印了！end" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        System.out.println("线程池中的线程数A:" + executor.getPoolSize());
        System.out.println("启动核心线程数量为：" + executor.prestartAllCoreThreads());
        System.out.println("线程池中的线程数B:" + executor.getPoolSize());
    }
}
