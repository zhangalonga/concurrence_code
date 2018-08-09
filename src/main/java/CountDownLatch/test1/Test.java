package CountDownLatch.test1;

/**
 * created by zhangalong on 2018/8/9
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(2000);
        service.downMethod();
    }
}
