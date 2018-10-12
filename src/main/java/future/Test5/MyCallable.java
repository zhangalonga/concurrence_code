package future.Test5;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/12
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        System.out.println("sleep 10秒执行完了");
        return "anyString";
    }
}
