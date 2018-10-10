package ThreadPoolExecutor.test22;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/10
 */
public class GetMaximumPoolSize_Test {
    public static void main(String[] args) {
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new SynchronousQueue<>());
        System.out.println("getMaximumPoolSize=" + executor.getMaximumPoolSize());
    }
}
