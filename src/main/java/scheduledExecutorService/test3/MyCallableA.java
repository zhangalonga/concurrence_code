package scheduledExecutorService.test3;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("a call run =" + System.currentTimeMillis());
        return "returnA";
    }
}
