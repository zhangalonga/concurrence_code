package ThreadPoolExecutor.test22;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/10
 */
public class GetActiveCount_Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadA a = new MyThreadA();
        final SynchronousQueue<Runnable> queue = new SynchronousQueue<>();
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, queue);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        System.out.println(executor.getActiveCount() + " " + executor.getPoolSize());
        Thread.sleep(7000);
        System.out.println(executor.getActiveCount() + " " + executor.getPoolSize());

    }
}
