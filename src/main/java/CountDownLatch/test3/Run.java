package CountDownLatch.test3;

/**
 * created by zhangalong on 2018/8/9
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA[] a = new ThreadA[11];
        for (int i = 0; i < a.length; i++) {
            a[i] = new ThreadA(service);
            a[i].setName("线程" + (i + 1));
            a[i].start();
        }

        Thread.sleep(2000);
        service.downMethod();
    }
}
