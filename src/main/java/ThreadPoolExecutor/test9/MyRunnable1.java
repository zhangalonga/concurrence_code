package ThreadPoolExecutor.test9;

/**
 * created by zhangalong on 2018/9/26
 */
public class MyRunnable1 implements Runnable {


    @Override
    public void run() {
        System.out.println("begin" + Thread.currentThread().getName() + "" + System.currentTimeMillis());
        try {
            Thread.sleep(4000);
            System.out.println("end" + Thread.currentThread().getName() + "" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
