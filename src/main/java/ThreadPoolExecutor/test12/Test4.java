package ThreadPoolExecutor.test12;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/28
 */
public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 runnable1 = new MyRunnable1();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.shutdown();
        System.out.println(executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS) + "" + System.currentTimeMillis() + "全部任务执行完毕");
    }
}
