package Phaser.test1;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/17
 */
public class ThreadC extends Thread {

    private Phaser phaser;

    public ThreadC(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodB();
    }
}
