package Phaser.test15;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/19
 */
public class Run1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();
    }
}
