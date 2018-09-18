package Phaser.test4;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/17
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        ThreadA A = new ThreadA(phaser);
        A.start();
    }
}
