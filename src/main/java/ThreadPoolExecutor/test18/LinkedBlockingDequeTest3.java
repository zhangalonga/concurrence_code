package ThreadPoolExecutor.test18;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/8
 */
public class LinkedBlockingDequeTest3 {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque<Runnable>();
        System.out.println(deque.size());
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, deque);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        System.out.println(executor.getPoolSize() + "  " + deque.size());
    }
}
