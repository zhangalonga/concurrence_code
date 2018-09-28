package ThreadPoolExecutor.test11;

/**
 * created by zhangalong on 2018/9/28
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "end" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
