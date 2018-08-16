package cyclicBarrier.test2;

import java.util.concurrent.CyclicBarrier;

/**
 * created by zhangalong on 2018/8/16
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(3);
        System.out.println(cbRef.getNumberWaiting());
        ThreadA a = new ThreadA(cbRef);
        a.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
        ThreadA b = new ThreadA(cbRef);
        b.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
        ThreadA c = new ThreadA(cbRef);
        c.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
        ThreadA d = new ThreadA(cbRef);
        d.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());

    }
}
