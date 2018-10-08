package ThreadPoolExecutor.test14;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/8
 */
public class Test2 {
    public static void main(String[] args) {
        MyRunnable1 runnable1 = new MyRunnable1("中国1");
        MyRunnable1 runnable2 = new MyRunnable1("中国2");
        MyRunnable1 runnable3 = new MyRunnable1("中国3");
        MyRunnable1 runnable4 = new MyRunnable1("中国4");
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 3, 9999L, TimeUnit.SECONDS, new SynchronousQueue<>());
        executor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        executor.execute(runnable1);
        executor.execute(runnable2);
        executor.execute(runnable3);
        executor.execute(runnable4);
    }
}
