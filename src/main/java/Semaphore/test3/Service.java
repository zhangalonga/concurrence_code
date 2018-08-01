package Semaphore.test3;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/8/1
 */
public class Service {
    private Semaphore semaphore = new Semaphore(10);

    public void testMethod() {
        try {
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName() + "begin time=" + System.currentTimeMillis());
            int sleepValue = ((int) (Math.random()));
            System.out.println(Thread.currentThread().getName() + "停止了" + (sleepValue / 1000) + "秒");
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + "end time=" + System.currentTimeMillis());
            semaphore.release(2);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
