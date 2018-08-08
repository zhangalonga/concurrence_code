package Semaphore.test15;

/**
 * created by zhangalong on 2018/8/8
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.get();
    }
}
