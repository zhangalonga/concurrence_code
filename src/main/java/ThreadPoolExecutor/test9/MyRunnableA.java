package ThreadPoolExecutor.test9;

/**
 * created by zhangalong on 2018/9/26
 */
public class MyRunnableA implements Runnable {
    private String username;

    public MyRunnableA(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
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
