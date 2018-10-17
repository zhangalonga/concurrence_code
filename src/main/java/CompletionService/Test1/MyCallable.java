package CompletionService.Test1;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/17
 */
public class MyCallable implements Callable<String> {
    private String username;
    private long sleepValue;

    public MyCallable(String username, long sleepValue) {
        this.username = username;
        this.sleepValue = sleepValue;
    }

    @Override
    public String call() throws Exception {
        System.out.println(username);
        Thread.sleep(sleepValue);
        return "return " + username;
    }
}
