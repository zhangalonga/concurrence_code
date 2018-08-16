package cyclicBarrier.test1;

import java.util.concurrent.CyclicBarrier;

/**
 * created by zhangalong on 2018/8/16
 */
public class Run {
    public static void main(String[] args) {
        CyclicBarrier cbRef = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("全都到了！");
            }
        });
        ThreadA[] a = new ThreadA[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new ThreadA(cbRef);
        }
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
    }
}
