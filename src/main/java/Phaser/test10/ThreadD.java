package Phaser.test10;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/19
 */
public class ThreadD extends Thread {
    private Phaser phaser;

    public ThreadD(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + "A1 begin=" + System.currentTimeMillis());
            Thread.sleep(5000);
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + "A1 end=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
