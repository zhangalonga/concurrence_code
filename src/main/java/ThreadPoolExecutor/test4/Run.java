package ThreadPoolExecutor.test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/9/21
 */
public class Run {
    public static void main(String[] args) {
        final ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            service.execute(new MyRunnable(("" + (i + 1))));
        }
        for (int i = 0; i < 3; i++) {
            service.execute(new MyRunnable(("" + (i + 1))));
        }
    }
}
