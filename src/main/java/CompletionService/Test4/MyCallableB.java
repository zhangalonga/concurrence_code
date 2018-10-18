package CompletionService.Test4;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/18
 */
public class MyCallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        System.out.println("MyCallableB" + System.currentTimeMillis());
        return "returnB";
    }
}
