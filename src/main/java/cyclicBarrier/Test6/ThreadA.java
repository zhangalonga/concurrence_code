package cyclicBarrier.Test6;

import java.util.concurrent.BrokenBarrierException;

/**
 * created by zhangalong on 2018/8/20
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.testMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
