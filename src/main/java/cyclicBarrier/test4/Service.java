package cyclicBarrier.test4;

import cyclicBarrier.test3.ThreadA;

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

    public void beginRun(int count) {
        try {
            System.out.println(Thread.currentThread().getName() + "到了 在等待其他人都到了开始起跑");
            if (Thread.currentThread().getName().equals("Thread-2")) {
                System.out.println("thread-2进来了");
                Thread.sleep(5000);
                Integer.parseInt("a");
            }
            cbRef.await();
            System.out.println("都到了，开始跑！");
            System.out.println(Thread.currentThread().getName() + "到达终点，并结束第" + count + "赛段");
        } catch (InterruptedException e) {
            System.out.println("进入了InterruptedException e" + cbRef.isBroken());
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("进入了BrokenBarrierException e" + cbRef.isBroken());
            e.printStackTrace();
        }
    }


    public void testA() {
        for (int i = 0; i < 1; i++) {
            beginRun(i + 1);
        }
    }


}
