package cyclicBarrier.test3;

import java.util.concurrent.CyclicBarrier;

/**
 * created by zhangalong on 2018/8/20
 */
public class Test {
    public static void main(String[] args) {
        CyclicBarrier cbRef = new CyclicBarrier(2);
        Service service = new Service(cbRef);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadA b = new ThreadA(service);
        b.setName("B");
        b.start();
        ThreadA c = new ThreadA(service);
        c.setName("C");
        c.start();
        ThreadA d = new ThreadA(service);
        d.setName("D");
        d.start();
    }
}
