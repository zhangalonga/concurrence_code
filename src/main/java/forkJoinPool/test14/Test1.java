package forkJoinPool.test14;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * created by zhangalong on 2018/11/21
 */
public class Test1 {
    public static void main(String[] args) {
        final UserInfo info = new UserInfo();
        final MyRunnable runnable = new MyRunnable(info);
        ForkJoinPool pool = new ForkJoinPool();
        final ForkJoinTask<UserInfo> task =
                pool.submit(runnable, info);
        System.out.println(task);
        System.out.println("name=" + info.getUsername());
    }
}
