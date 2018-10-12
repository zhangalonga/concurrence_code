package future.Test3;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/11
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UserInfo info = new UserInfo();
        MyRunnable runnable = new MyRunnable(info);
        final ThreadPoolExecutor executor =
                new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        final Future<UserInfo> future = executor.submit(runnable, info);
        System.out.println(future.getClass());
        System.out.println("begin time=" + System.currentTimeMillis());
        info = future.get();
        System.out.println("get value" + info.getUsername() + " " + info.getPassword());
        System.out.println("end time=" + System.currentTimeMillis());

    }
}
