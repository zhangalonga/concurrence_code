package ThreadPoolExecutor.test19;

/**
 * created by zhangalong on 2018/10/9
 */
public class MyRunnable implements Runnable {
    private String userName;

    public MyRunnable(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        System.out.println(userName + "run");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
