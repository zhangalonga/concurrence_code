package Phaser.test3;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/17
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PrintTools.phaser = phaser;
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(phaser);
        c.setName("C");
        c.start();
    }
}
