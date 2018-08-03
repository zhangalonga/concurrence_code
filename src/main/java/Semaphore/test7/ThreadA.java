package Semaphore.test7;

/**
 * created by zhangalong on 2018/8/3
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + this.getName() + "启动了");
        service.testMethod();
    }
}
