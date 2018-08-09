package CountDownLatch.test4;

import java.util.concurrent.CountDownLatch;

/**
 * created by zhangalong on 2018/8/9
 */
public class ThreadA extends Thread {
    private CountDownLatch comingTag;//裁判等待所有运动员到来
    private CountDownLatch waitRag;//等待裁判说准备开始
    private CountDownLatch waitRunTag;//等待起跑
    private CountDownLatch beginTag;//起跑
    private CountDownLatch endTag;//所有运动员到达终点

    public ThreadA(CountDownLatch comingTag, CountDownLatch waitRag, CountDownLatch waitRunTag, CountDownLatch beginTag, CountDownLatch endTag) {
        this.comingTag = comingTag;
        this.waitRag = waitRag;
        this.waitRunTag = waitRunTag;
        this.beginTag = beginTag;
        this.endTag = endTag;
    }

    @Override
    public void run() {
        try {
            System.out.println("运动员使用不同的交通工具以不同的速度到达起跑点，正向这头走");
            Thread.sleep((int) (Math.random() * 10000));
            System.out.println(Thread.currentThread().getName() + "到达起跑点了");
            comingTag.countDown();
            System.out.println("等待裁判说准备");
            waitRag.await();
            System.out.println("各就各位！准备起跑姿势");
            Thread.sleep((int) (Math.random() * 10000));
            waitRunTag.countDown();
            beginTag.await();
            System.out.println(Thread.currentThread().getName() + "运动员起跑并且跑赛过程用时不确定");
            Thread.sleep((int) (Math.random() * 10000));
            endTag.countDown();
            System.out.println(Thread.currentThread().getName() + "运动员到达终点");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
