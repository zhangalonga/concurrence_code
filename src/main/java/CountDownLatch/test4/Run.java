package CountDownLatch.test4;

import java.util.concurrent.CountDownLatch;

/**
 * created by zhangalong on 2018/8/9
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch comingTag = new CountDownLatch(10);
        CountDownLatch waitTag = new CountDownLatch(1);
        CountDownLatch waitRunTag = new CountDownLatch(10);
        CountDownLatch beginTag = new CountDownLatch(1);
        CountDownLatch endTag = new CountDownLatch(10);
        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new ThreadA(comingTag, waitTag, waitRunTag, beginTag, endTag);
            a[i].start();
        }
        System.out.println("裁判看到所有运动员来了，各就各位巡视用时5秒");
        Thread.sleep(5000);
        waitTag.countDown();
        System.out.println("各就各位");
        waitRunTag.await();
        Thread.sleep(2000);
        System.out.println("发令枪响起");
        beginTag.countDown();
        endTag.await();
        System.out.println("所有运动员到达，统计比赛名次");

    }
}
