package cyclicBarrier.test7;

/**
 * created by zhangalong on 2018/8/21
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
