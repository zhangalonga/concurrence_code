package ThreadPoolExecutor.test22;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/10
 */
public class GetPoolSize_Test {
    public static void main(String[] args) {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new SynchronousQueue<>());
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        System.out.println(executor.getPoolSize());


    }
}
