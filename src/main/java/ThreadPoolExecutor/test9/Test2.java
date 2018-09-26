package ThreadPoolExecutor.test9;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/26
 */
public class Test2 {
    public static void main(String[] args) {
        MyRunnable1 runnable1 = new MyRunnable1();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 10, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable1);
        System.out.println("end!");
    }
}
