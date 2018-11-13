package scheduledExecutorService.test2;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyRunnableB implements Runnable {
    @Override
    public void run() {

        try {
            System.out.println("runnableB Begin" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("runnableB end" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
