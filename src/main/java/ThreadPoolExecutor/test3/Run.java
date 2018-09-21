package ThreadPoolExecutor.test3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/9/21
 */
public class Run {
    public static void main(String[] args) {
        MyThreadFactory threadFactory = new MyThreadFactory();
        final ExecutorService service = Executors.newCachedThreadPool(threadFactory);
        service.execute(() -> System.out.println("我在运行" + System.currentTimeMillis() + "" + Thread.currentThread().getName()));
    }
}
