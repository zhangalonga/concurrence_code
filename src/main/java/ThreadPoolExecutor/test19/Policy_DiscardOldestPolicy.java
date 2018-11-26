package ThreadPoolExecutor.test19;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/9
 */
public class Policy_DiscardOldestPolicy {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i < 5; i++) {
            MyRunnable runnable = new MyRunnable("MyRunnable" + (i + 1));
            executor.execute(runnable);
        }
        Thread.sleep(50);
        Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(((MyRunnable) o).getUserName());
        }
        executor.execute(new MyRunnable("Runable6"));
        executor.execute(new MyRunnable("Runable7"));
        Iterator<Runnable> iterator1 = queue.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(((MyRunnable) o).getUserName());
        }

    }
}
