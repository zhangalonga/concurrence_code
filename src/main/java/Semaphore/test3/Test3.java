package Semaphore.test3;

/**
 * created by zhangalong on 2018/8/1
 */
public class Test3 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new ThreadA(service);
            a[i].start();
        }

    }
}
