package Semaphore.test12;

/**
 * created by zhangalong on 2018/8/7
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread[] threads = new MyThread[12];
        for (MyThread thread : threads) {
            thread = new MyThread(service);
            thread.start();
        }
    }
}
