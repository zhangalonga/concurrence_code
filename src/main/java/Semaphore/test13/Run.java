package Semaphore.test13;

/**
 * created by zhangalong on 2018/8/7
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA[] threads = new ThreadA[12];
        for (ThreadA thread : threads) {
            thread = new ThreadA(service);
            thread.start();
        }
    }
}
