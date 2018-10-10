package ThreadPoolExecutor.test23;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/10
 */
public class Test {
    public static void main(String[] args) {
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        for (int i = 0; i < 50; i++) {
            MyRunnable runnable = new MyRunnable("USERNAME" + (i + 1));
            executor.execute(runnable);
        }
    }
}
