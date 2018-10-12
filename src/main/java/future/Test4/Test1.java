package future.Test4;

import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/12
 */
public class Test1 {
    public static void main(String[] args) {
        MyCallable callable = new MyCallable();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        Future<String> future = executor.submit(callable);
        System.out.println(future.cancel(true) + " " + future.isCancelled());
    }
}
