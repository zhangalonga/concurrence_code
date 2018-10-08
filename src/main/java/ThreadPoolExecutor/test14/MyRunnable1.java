package ThreadPoolExecutor.test14;

/**
 * created by zhangalong on 2018/10/8
 */
public class MyRunnable1 implements Runnable {
    private String userName;

    public MyRunnable1(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
