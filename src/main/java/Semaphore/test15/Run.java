package Semaphore.test15;

/**
 * created by zhangalong on 2018/8/8
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA[] a = new ThreadA[60];
        ThreadB[] b = new ThreadB[60];
        for (int i = 0; i < 60; i++) {
            a[i] = new ThreadA(service);
            b[i] = new ThreadB(service);
        }
        Thread.sleep(2000);
        for (int i = 0; i < 60; i++) {
            a[i].start();
            b[i].start();
        }
    }
}
