package Semaphore.test4;

import Semaphore.test3.ThreadA;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/8/1
 */
public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "begin time" + System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String string = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName() + "end time" + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "进入了catch");
            e.printStackTrace();
        }
    }
}
