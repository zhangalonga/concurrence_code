package ThreadPoolExecutor.test12;

/**
 * created by zhangalong on 2018/9/28
 */
public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
