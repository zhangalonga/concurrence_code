package Semaphore.test3;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/8/1
 */
public class Run {
    //成功添加动态许可
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(5);
        semaphore.acquire();
        semaphore.acquire();
        semaphore.acquire();
        semaphore.acquire();
        semaphore.acquire();
        System.out.println(semaphore.availablePermits());
        semaphore.release();
        semaphore.release();
        semaphore.release();
        semaphore.release();
        semaphore.release();
        System.out.println(semaphore.availablePermits());
        semaphore.release(4);
        System.out.println(semaphore.availablePermits());
    }
}
