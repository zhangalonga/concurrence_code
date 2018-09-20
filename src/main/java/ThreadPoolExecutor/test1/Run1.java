package ThreadPoolExecutor.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/9/20
 */
public class Run1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            try {
                System.out.println("Runnable1 begin" + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("A");
                System.out.println("Runnable1 end" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        service.execute(() -> {
            try {
                System.out.println("Runnable2 begin" + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("B");
                System.out.println("Runnable2 end" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
