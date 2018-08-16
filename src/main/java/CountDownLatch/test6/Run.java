package CountDownLatch.test6;

import java.util.concurrent.CountDownLatch;

/**
 * created by zhangalong on 2018/8/16
 */
public class Run {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(3);
        System.out.println("main getcount1==" + count.getCount());
        count.countDown();
        System.out.println("main getcount2==" + count.getCount());
        count.countDown();
        System.out.println("main getcount3==" + count.getCount());
        count.countDown();
        System.out.println("main getcount4==" + count.getCount());
        count.countDown();
        System.out.println("main getcount5==" + count.getCount());
        count.countDown();
        System.out.println("main getcount6==" + count.getCount());

    }
}
