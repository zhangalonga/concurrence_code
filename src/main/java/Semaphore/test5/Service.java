package Semaphore.test5;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/8/3
 */
public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName() + "begin time=" + System.currentTimeMillis());
        for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
            String newString = new String();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + "end time" + System.currentTimeMillis());
        semaphore.release();
    }

}
