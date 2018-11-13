package scheduledExecutorService.test4;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyRunnabelB implements Runnable {
    @Override
    public void run() {
        System.out.println("runnableB Begin" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        System.out.println("runnableB end  " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
    }
}
