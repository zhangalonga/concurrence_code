package exchanger.test2;

import java.util.concurrent.Exchanger;

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
            System.out.println("在线程A中得到线程B的值=" + exchanger.exchange("中国人A"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
