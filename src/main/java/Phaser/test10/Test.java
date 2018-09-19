package Phaser.test10;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/19
 */
public class Test {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(phaser);
        c.setName("C");
        c.start();
        ThreadD d = new ThreadD(phaser);
        d.setName("D");
        d.start();
    }
}
