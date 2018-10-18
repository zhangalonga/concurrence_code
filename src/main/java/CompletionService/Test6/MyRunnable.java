package CompletionService.Test6;

/**
 * created by zhangalong on 2018/10/18
 */
public class MyRunnable implements Runnable {
    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        userInfo.setUserName("zhangalong");
        userInfo.setPassword("123456");
        System.out.println("运行了");
    }
}
