package cyclicBarrier.test5;

/**
 * created by zhangalong on 2018/8/20
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
