package CompletionService.Test5;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/18
 */
public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin" + System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println("MyCallableA end" + System.currentTimeMillis());
        return "returnA";
    }
}
