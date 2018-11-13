package scheduledExecutorService.test5;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyRunableB implements Runnable {
    @Override
    public void run() {
        System.out.println("begin=" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
        System.out.println("end=  " + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
    }
}
