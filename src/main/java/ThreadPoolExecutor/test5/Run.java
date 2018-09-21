package ThreadPoolExecutor.test5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/9/21
 */
public class Run {
    public static void main(String[] args) {
        final MyThreadFactory factory = new MyThreadFactory();
        final ExecutorService service = Executors.newFixedThreadPool(2, factory);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("begin我在运行" + System.currentTimeMillis() + "" + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("end我在运行" + System.currentTimeMillis() + "" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        service.execute(r);
        service.execute(r);
        service.execute(r);


    }
}
