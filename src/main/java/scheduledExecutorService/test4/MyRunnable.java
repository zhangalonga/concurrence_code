package scheduledExecutorService.test4;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(" Begin" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println("end" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
