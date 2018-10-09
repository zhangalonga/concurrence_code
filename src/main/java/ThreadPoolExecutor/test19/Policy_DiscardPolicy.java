package ThreadPoolExecutor.test19;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/9
 */
public class Policy_DiscardPolicy {
    public static void main(String[] args) throws InterruptedException {
        Runnable a = () -> {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "run end!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(2);
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.DiscardPolicy());
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        Thread.sleep(8000);
        System.out.println(executor.getPoolSize() + " " + queue.size());

    }
}
