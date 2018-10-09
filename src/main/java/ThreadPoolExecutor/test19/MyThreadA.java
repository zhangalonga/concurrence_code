package ThreadPoolExecutor.test19;

/**
 * created by zhangalong on 2018/10/9
 */
public class MyThreadA extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("end" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
