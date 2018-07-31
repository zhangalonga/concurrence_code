package Semaphore.test1;

/**
 * created by zhangalong on 2018/7/31
 */
public class ThreadB extends Thread{
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
