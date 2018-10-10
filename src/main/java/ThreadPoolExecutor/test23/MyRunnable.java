package ThreadPoolExecutor.test23;

/**
 * created by zhangalong on 2018/10/10
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
        System.out.println(userName);
    }
}
