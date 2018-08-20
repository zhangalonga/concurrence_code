package cyclicBarrier.Test6;

/**
 * created by zhangalong on 2018/8/20
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadC c = new ThreadC(service);
        c.setName("C");
        a.start();
        b.start();
        c.start();
        Thread.sleep(2000);
        System.out.println("屏障对象的partirs个数为：" + service.cbRef.getParties());
        System.out.println("在屏障处等待的个数为：" + service.cbRef.getNumberWaiting());

    }
}
