package Phaser.test9;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/18
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        MyService service = new MyService(phaser);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();

    }
}
