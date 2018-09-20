package ThreadPoolExecutor.test2;

/**
 * created by zhangalong on 2018/9/20
 */
public class MyRunnable implements Runnable {
    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "username=" + username + "begin" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "username=" + username + "end" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
