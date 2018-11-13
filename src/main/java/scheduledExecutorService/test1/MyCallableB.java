package scheduledExecutorService.test1;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyCallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("callb begin" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        System.out.println("callb end  " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        return "returnB";
    }
}
