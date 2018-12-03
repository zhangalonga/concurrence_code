package kuajia.Test1;

/**
 * created by zhangalong on 2018/12/3
 */
public class Test1_2 {
    public static void main(String[] args) {
        final MyService1 service1 = new MyService1();
        final ThreadA a = new ThreadA(service1);
        final ThreadB b = new ThreadB(service1);
        a.start();
        b.start();
    }
}
