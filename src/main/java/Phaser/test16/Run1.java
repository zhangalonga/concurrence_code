package Phaser.test16;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/20
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        phaser.register();
        for (int i = 0; i < 3; i++) {
            ThreadA t = new ThreadA(phaser);
            t.start();
        }
        Thread.sleep(5000);
        phaser.arriveAndDeregister();
    }
}
