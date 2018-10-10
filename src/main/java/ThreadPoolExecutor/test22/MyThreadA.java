package ThreadPoolExecutor.test22;

/**
 * created by zhangalong on 2018/10/10
 */
public class MyThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("begin" + Thread.currentThread().getName() + " " + System.currentTimeMillis() + "运行中");
        try {
            Thread.sleep(5000);
            System.out.println("end" + Thread.currentThread().getName() + " " + System.currentTimeMillis() + "运行中");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
