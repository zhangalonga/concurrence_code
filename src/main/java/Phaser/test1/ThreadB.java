package Phaser.test1;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/17
 */
public class ThreadB extends Thread {

    private Phaser phaser;

    public ThreadB(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodA();
    }
}
