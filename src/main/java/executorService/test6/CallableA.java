package executorService.test6;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/24
 */
public class CallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + "end" + System.currentTimeMillis());
        return "returnA";
    }
}
