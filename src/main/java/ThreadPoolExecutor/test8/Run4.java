package ThreadPoolExecutor.test8;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/25
 */
public class Run4 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "run!" + System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        /**
         * BlockingQueue只是一个接口，它主要有两个实现，LinkedBlockingDeque和ArrayBlockingQueue
         * LinkedBlockingDeque的好处在于没有大小的限制，队列容量非常大，所以执行方法不会抛出异常，
         * 而线程池中运行的线程数也永远不会超过corePoolSize的数量大小，因为其他多余的线程被放入
         *LinkedBlockingDeque队列中，keepAliveTime参数也没有意义了
         *
         */
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);
        Thread.sleep(300);
        System.out.println("A:" + executor.getCorePoolSize());
        System.out.println("A:" + executor.getPoolSize());
        System.out.println("A:" + executor.getQueue().size());
        Thread.sleep(10000);
        System.out.println("B:" + executor.getCorePoolSize());
        System.out.println("B:" + executor.getPoolSize());
        System.out.println("B:" + executor.getQueue().size());
    }
}
