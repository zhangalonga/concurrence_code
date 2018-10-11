package future.Test1;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/11
 */
public class Run {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable(100);
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        Future<String> future = executor.submit(callable);
        System.out.println("main a" + System.currentTimeMillis());
        System.out.println(future.get());
        System.out.println("main b" + System.currentTimeMillis());

    }
}
