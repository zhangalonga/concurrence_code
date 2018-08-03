package Semaphore.test7;

/**
 * created by zhangalong on 2018/8/3
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadA a[] = new ThreadA[4];
        for (ThreadA threadA1 : a) {
            threadA1 = new ThreadA(service);
            threadA1.start();
        }
    }
}
