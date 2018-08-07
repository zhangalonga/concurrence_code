package Semaphore.test14;

/**
 * created by zhangalong on 2018/8/7
 */
public class Test {
    public static void main(String[] args) {
        ListPool pool = new ListPool();
        ThreadA[] a = new ThreadA[12];
        for (ThreadA threadA : a) {
            threadA = new ThreadA(pool);
            threadA.start();
        }
    }
}
