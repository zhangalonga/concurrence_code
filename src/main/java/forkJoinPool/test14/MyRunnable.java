package forkJoinPool.test14;

/**
 * created by zhangalong on 2018/11/21
 */
public class MyRunnable implements Runnable {
    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        try {
            userInfo.setUsername("设置的值");
            System.out.println("已经设置完结！");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
