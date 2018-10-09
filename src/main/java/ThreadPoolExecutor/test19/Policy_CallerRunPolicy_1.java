package ThreadPoolExecutor.test19;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/10/9
 */
public class Policy_CallerRunPolicy_1 {
    public static void main(String[] args) {
        MyThreadA a = new MyThreadA();
        LinkedBlockingDeque<Runnable> deque = new LinkedBlockingDeque<>(2);
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, deque, new ThreadPoolExecutor.CallerRunsPolicy());
        System.out.println("A BEGIN" + Thread.currentThread().getName() + "" + System.currentTimeMillis());
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        System.out.println("A END" + Thread.currentThread().getName() + "" + System.currentTimeMillis());
    }
}
