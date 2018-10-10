package ThreadPoolExecutor.test20;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/10
 */
public class Run {
    public static void main(String[] args) {
        MyThreadPoolExecutor executor =
                new MyThreadPoolExecutor(2, 2, Integer.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(new MyRunnable("A1"));
        executor.execute(new MyRunnable("A2"));
        executor.execute(new MyRunnable("A3"));
        executor.execute(new MyRunnable("A4"));


    }
}
