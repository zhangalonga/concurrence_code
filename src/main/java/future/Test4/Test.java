package future.Test4;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/12
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        Future<String> future = executor.submit(callable);
        System.out.println(future.get());
        System.out.println(future.cancel(true) + " " + future.isCancelled());
    }
}
