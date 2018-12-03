package kuajia.Test2;

/**
 * created by zhangalong on 2018/12/3
 */
public class Test2 {
    public static void main(String[] args) {
        final MyService2 service2 = new MyService2();
        final ThreadA a = new ThreadA(service2);
        final ThreadB b = new ThreadB(service2);
        a.start();
        b.start();
    }
}
