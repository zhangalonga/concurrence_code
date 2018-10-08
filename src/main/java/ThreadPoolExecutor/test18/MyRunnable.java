package ThreadPoolExecutor.test18;

/**
 * created by zhangalong on 2018/10/8
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("begin" + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
            System.out.println("end" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
