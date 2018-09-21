package ThreadPoolExecutor.test3;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadFactory;

/**
 * created by zhangalong on 2018/9/21
 */
public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(@NotNull Runnable r) {
        Thread t = new Thread(r);
        t.setName("定制池中的线程对象的名称" + Math.random());
        return t;
    }
}
