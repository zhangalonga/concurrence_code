package cyclicBarrier.test4;

import java.util.concurrent.CyclicBarrier;

/**
 * created by zhangalong on 2018/8/20
 */
public class Test {
    public static void main(String[] args) {
        int parties = 4;
        CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
            @Override
            public void run() {
                System.out.println("都到了！");
            }
        });
        Service service = new Service(cbRef);
        ThreadA[] threadAS = new ThreadA[4];
        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i] = new ThreadA(service);
            threadAS[i].start();
        }
    }
}
