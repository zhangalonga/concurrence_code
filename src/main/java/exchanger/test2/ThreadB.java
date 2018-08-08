package exchanger.test2;

import java.util.concurrent.Exchanger;

/**
 * created by zhangalong on 2018/8/8
 */
public class ThreadB extends Thread {
    private Exchanger<String> exchanger = new Exchanger<>();

    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("在线程B中得到线程A的值=" + exchanger.exchange("中国人B"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
