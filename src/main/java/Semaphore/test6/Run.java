package Semaphore.test6;

/**
 * created by zhangalong on 2018/8/3
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread[] a = new ThreadA[4];
        for (Thread thread : a) {
            thread = new ThreadA(service);
            thread.start();
        }
    }
}
