package ThreadPoolExecutor.test6;

/**
 * created by zhangalong on 2018/9/21
 */
public class MyRunnable implements Runnable {
    private String userName;

    public MyRunnable(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "username=" + userName + "begin" + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "username=" + userName + "end" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}