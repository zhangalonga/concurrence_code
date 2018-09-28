package ThreadPoolExecutor.test13;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

/**
 * created by zhangalong on 2018/9/28
 */
public class ThreadFactory implements java.util.concurrent.ThreadFactory {
    @Override
    public Thread newThread(@NotNull Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("高洪岩：" + new Date());
        return thread;
    }
}
