package CountDownLatch.test1;

import java.util.concurrent.CountDownLatch;

/**
 * created by zhangalong on 2018/8/9
 */
public class Service {
    private CountDownLatch downLatch = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println("A");
            downLatch.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void downMethod() {
        System.out.println("X");
        downLatch.countDown();
    }
}
