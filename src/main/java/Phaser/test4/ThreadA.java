package Phaser.test4;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/17
 */
public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A end phase value=" + phaser.getPhase());
        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A end phase value=" + phaser.getPhase());
        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("a end phsae value=" + phaser.getPhase());
    }
}
