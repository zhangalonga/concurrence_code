package future.Test7;

/**
 * created by zhangalong on 2018/10/12
 */
public class MyRunnable implements Runnable {
    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(username + "在运行");
    }
}
