package Semaphore.test2;


/**
 * created by zhangalong on 2018/7/31
 */
public class ThreadC extends Thread{
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
