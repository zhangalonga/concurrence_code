package ThreadPoolExecutor.test13;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadFactory;

/**
 * created by zhangalong on 2018/9/28
 */
public class ThreadFactoryA implements ThreadFactory {
    @Override
    public Thread newThread(@NotNull Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("张阿龙" + System.currentTimeMillis());
        thread.setUncaughtExceptionHandler((t, e) -> System.out.println("自定义处理异常启动" + t.getName() + "" + e.getMessage()));
        return thread;
    }
}
