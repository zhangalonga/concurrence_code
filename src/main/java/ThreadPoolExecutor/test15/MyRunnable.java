package ThreadPoolExecutor.test15;

/**
 * created by zhangalong on 2018/10/8
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + "end" + System.currentTimeMillis());
    }
}
