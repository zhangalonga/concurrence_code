package Phaser.test16;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/20
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        for (int i = 0; i < 3; i++) {
            ThreadA t = new ThreadA(phaser);
            t.start();
        }
    }
}
