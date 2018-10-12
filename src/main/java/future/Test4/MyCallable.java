package future.Test4;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/12
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "我的年龄是100";
    }


}
