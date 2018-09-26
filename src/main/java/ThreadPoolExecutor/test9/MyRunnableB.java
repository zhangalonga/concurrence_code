package ThreadPoolExecutor.test9;

/**
 * created by zhangalong on 2018/9/26
 */
public class MyRunnableB implements Runnable {
    private String userName;

    public MyRunnableB(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE / 500; i++) {
            String s1 = new String();
            String s2 = new String();
            String s3 = new String();
            String s4 = new String();
            String s5 = new String();
            String s6 = new String();
            String s7 = new String();
            Math.random();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + "任务完成！");

    }
}
