package future.Test3;

/**
 * created by zhangalong on 2018/10/11
 */
public class MyRunnable implements Runnable {
    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        userInfo.setUsername("userName1");
        userInfo.setPassword("passWord1");
    }
}
