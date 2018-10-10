package ThreadPoolExecutor.test20;

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
        System.out.println("打印了！begin" + userName + " " + System.currentTimeMillis());
        try {
            Thread.sleep(4000);
            System.out.println("打印了！end" + userName + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
