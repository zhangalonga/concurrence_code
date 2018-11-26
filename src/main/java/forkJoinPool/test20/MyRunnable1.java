package forkJoinPool.test20;

/**
 * created by zhangalong on 2018/11/26
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
