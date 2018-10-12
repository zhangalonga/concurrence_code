package future.Test8;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/12
 */
public class Test1 {
    public static void main(String[] args) {
        final ThreadPoolExecutor executor =
                new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute方法执行了，没有返回值");
            }
        });
        executor.submit(new Callable<String>() {
            @Override
            public String call() {
                System.out.println("submit方法执行了，有返回值");
                return "我是返回值";
            }
        });
    }
}
