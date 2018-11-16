package scheduledExecutorService.test8;

/**
 * created by zhangalong on 2018/11/16
 */
public class MyRunnable implements Runnable {
    private String userName;

    public MyRunnable(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        System.out.println("run!username=" + userName + " " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
    }
}
