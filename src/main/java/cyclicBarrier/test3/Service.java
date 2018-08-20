package cyclicBarrier.test3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * created by zhangalong on 2018/8/20
 */
public class Service {
    private CyclicBarrier cbRef;

    public Service(CyclicBarrier cbRef) {
        this.cbRef = cbRef;
    }

    public void beginRun() {
        try {
            long sleepValue = (int) (Math.random() * 10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "begin跑第一阶段" + (cbRef.getNumberWaiting() + 1));
            cbRef.await();
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "end跑第一阶段" + " " + cbRef.getNumberWaiting());
            sleepValue = (int) (Math.random() * 10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "begin跑第二阶段" + (cbRef.getNumberWaiting() + 1));
            cbRef.await();
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "end跑第二阶段" + cbRef.getNumberWaiting());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }


    }
}
