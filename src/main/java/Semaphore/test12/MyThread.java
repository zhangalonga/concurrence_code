package Semaphore.test12;

/**
 * created by zhangalong on 2018/8/7
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.sayHello();
    }
}
