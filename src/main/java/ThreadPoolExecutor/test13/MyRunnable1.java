package ThreadPoolExecutor.test13;

/**
 * created by zhangalong on 2018/9/28
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "" + System.currentTimeMillis());
        String abc = null;
        abc.indexOf(0);
        System.out.println(Thread.currentThread().getName() + "" + System.currentTimeMillis());
    }
}
