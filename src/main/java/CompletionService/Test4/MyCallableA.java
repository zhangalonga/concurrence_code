package CompletionService.Test4;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/18
 */
public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        System.out.println("MyCallableA" + System.currentTimeMillis());
        return "returnA";
    }
}
