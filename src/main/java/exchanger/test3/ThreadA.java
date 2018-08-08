package exchanger.test3;


import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * created by zhangalong on 2018/8/8
 */
public class ThreadA extends Thread {
    private Exchanger<String> exchanger = new Exchanger<>();

    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("在线程A中得到线程B的值=" + exchanger.exchange("中国人A", 5, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

}
