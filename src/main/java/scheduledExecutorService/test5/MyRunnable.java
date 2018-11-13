package scheduledExecutorService.test5;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {

        try {
            System.out.println("begin=" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
            Thread.sleep(4000);
            System.out.println("end=  " + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
