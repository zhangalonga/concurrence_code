package cyclicBarrier.test7;

/**
 * created by zhangalong on 2018/8/21
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
        Thread.sleep(2000);
        service.cyclicBarrier.reset();
    }
}
