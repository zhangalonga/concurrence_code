package Phaser.test14;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * created by zhangalong on 2018/9/19
 */
public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "A1 begin=" + System.currentTimeMillis());
        try {
            phaser.awaitAdvanceInterruptibly(0, 5, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName() + "A1 end=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("InterruptedException e");
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("TimeoutException e");
        }
    }
}
