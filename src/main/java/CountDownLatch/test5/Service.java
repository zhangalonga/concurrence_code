package CountDownLatch.test5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/8/16
 */
public class Service {
    public CountDownLatch count = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备" + System.currentTimeMillis());
            count.await(3, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName() + "结束" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
