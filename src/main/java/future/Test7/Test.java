package future.Test7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * created by zhangalong on 2018/10/12
 */
public class Test {
    public static void main(String[] args) {
        final ExecutorService pool = Executors.newCachedThreadPool();
        final ThreadPoolExecutor executor = (ThreadPoolExecutor) pool;
        executor.setRejectedExecutionHandler(new MyRejectedExectionHandler());
        pool.submit(new MyRunnable("A"));
        pool.submit(new MyRunnable("B"));
        pool.submit(new MyRunnable("C"));
        executor.shutdown();
        pool.submit(new MyRunnable("D"));
    }
}
