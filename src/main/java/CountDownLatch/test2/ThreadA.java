package CountDownLatch.test2;

import java.util.concurrent.CountDownLatch;

/**
 * created by zhangalong on 2018/8/9
 */
public class ThreadA extends Thread {
    private CountDownLatch maxRuner;

    public ThreadA(CountDownLatch maxRuner) {
        this.maxRuner = maxRuner;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            maxRuner.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
