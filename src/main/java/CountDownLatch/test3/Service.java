package CountDownLatch.test3;

import java.util.concurrent.CountDownLatch;

/**
 * created by zhangalong on 2018/8/9
 */
public class Service {
    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备");
            countDownLatch.await();
            System.out.println(Thread.currentThread().getName() + "结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMethod() {
        System.out.println("开始");
        countDownLatch.countDown();
    }
}
