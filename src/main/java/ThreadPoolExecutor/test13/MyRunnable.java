package ThreadPoolExecutor.test13;

/**
 * created by zhangalong on 2018/9/28
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "" + System.currentTimeMillis());
        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + "" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
