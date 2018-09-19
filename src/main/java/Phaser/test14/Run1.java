package Phaser.test14;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/19
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
        Thread.sleep(1000);
        phaser.arrive();
        Thread.sleep(1000);
        phaser.arrive();
        Thread.sleep(1000);
        phaser.arrive();
        System.out.println(System.currentTimeMillis());
    }
}
