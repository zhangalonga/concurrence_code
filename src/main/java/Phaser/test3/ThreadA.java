package Phaser.test3;

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
        PrintTools.methodA();
    }
}
