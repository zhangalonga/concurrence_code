package ThreadPoolExecutor.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/9/20
 */
public class Run {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            service.execute(new MyRunnable(("" + (i + 1))) {
            });
        }
    }
}
