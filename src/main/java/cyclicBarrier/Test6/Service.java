package cyclicBarrier.Test6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * created by zhangalong on 2018/8/20
 */
public class Service {
    public CyclicBarrier cbRef = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("彻底结束了" + System.currentTimeMillis());
        }
    });

    public void testMethod() throws InterruptedException, BrokenBarrierException {
        System.out.println(Thread.currentThread().getName() + "准备" + System.currentTimeMillis());
        if (Thread.currentThread().getName().equals("C")) {
            Thread.sleep(Integer.MAX_VALUE);
        }
        cbRef.await();
        System.out.println(Thread.currentThread().getName() + "开始" + System.currentTimeMillis());

    }

}
