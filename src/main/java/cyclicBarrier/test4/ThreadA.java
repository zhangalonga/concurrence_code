package cyclicBarrier.test4;

/**
 * created by zhangalong on 2018/8/20
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testA();
    }
}
