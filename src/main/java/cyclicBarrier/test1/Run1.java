package cyclicBarrier.test1;

import java.util.concurrent.CyclicBarrier;

/**
 * created by zhangalong on 2018/8/16
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("全来了！");
            }
        });
        for (int i = 0; i < 4; i++) {
            ThreadB threadB = new ThreadB(cbRef);
            threadB.start();
            Thread.sleep(2000);
        }
    }
}
