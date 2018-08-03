package Semaphore.test7;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/8/3
 */
public class Service {
    private boolean isFair = true;
    private Semaphore semaphore = new Semaphore(1, isFair);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println("ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
