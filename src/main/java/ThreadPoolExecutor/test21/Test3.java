package ThreadPoolExecutor.test21;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/10
 */
public class Test3 {
    public static void main(String[] args) {

        try {
            Runnable a1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "begin");
                    try {
                        Thread.sleep(5000);
                        System.out.println(Thread.currentThread().getName() + "end");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };


            Runnable a2 = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "begin");
                    try {
                        Thread.sleep(5000);
                        System.out.println(Thread.currentThread().getName() + "end");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            final ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            executor.submit(a1);
            executor.submit(a2);
            Thread.sleep(1000);
            executor.remove(a2);
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
