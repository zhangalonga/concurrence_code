package CountDownLatch.test2;


import java.util.concurrent.CountDownLatch;

/**
 * created by zhangalong on 2018/8/9
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch maxRuner = new CountDownLatch(10);
        ThreadA[] array = new ThreadA[Integer.parseInt("" + maxRuner.getCount())];
        for (int i = 0; i < array.length; i++) {
            array[i] = new ThreadA(maxRuner);
            array[i].setName("线程" + (i + 1));
            array[i].start();
        }
        maxRuner.await();
        System.out.println("都回来了");
    }
}
