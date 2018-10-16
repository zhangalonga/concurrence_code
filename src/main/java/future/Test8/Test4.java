package future.Test8;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/16
 */
public class Test4 {
    public static void main(String[] args) {
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.setThreadFactory(new ThreadFactory() {
            @Override
            public Thread newThread(@NotNull Runnable r) {
                Thread thread = new Thread(r);
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println("execute()方法通过使用自定义捕捉异常");
                        System.out.println("也能捕捉异常了");
                    }
                });
                return thread;
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                Integer.parseInt("a");
            }
        });

    }
}
