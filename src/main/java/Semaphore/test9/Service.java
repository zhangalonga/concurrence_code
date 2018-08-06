package Semaphore.test9;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/8/6
 */
public class Service {
    private Semaphore semaphore = new Semaphore(3);

    public void testMethod() {
        if (semaphore.tryAcquire(3)) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "首选进入");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String string = new String();
                Math.random();
            }
            semaphore.release(3);
        } else {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入");
        }
    }
}
