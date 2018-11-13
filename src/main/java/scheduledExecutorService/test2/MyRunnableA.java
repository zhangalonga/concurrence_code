package scheduledExecutorService.test2;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyRunnableA implements Runnable {
    @Override
    public void run() {

        try {
            System.out.println("runnableA Begin" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("runnableA end" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
