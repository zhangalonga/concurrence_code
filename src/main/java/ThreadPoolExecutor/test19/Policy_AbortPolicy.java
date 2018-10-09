package ThreadPoolExecutor.test19;

import Phaser.test1.Run;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/9
 */
public class Policy_AbortPolicy {
    public static void main(String[] args) {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName() + "run end!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new ThreadPoolExecutor.AbortPolicy());
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        //报错

    }
}
