package ThreadPoolExecutor.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/9/20
 */
public class Run2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.execute(() -> {
                System.out.println("run");
            });
        }

    }
}
