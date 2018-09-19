package Phaser.test11;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/19
 */
public class Run {
    public static void main(String[] args) {

        try {
            Phaser phaser = new Phaser(3);
            ThreadA a = new ThreadA(phaser);
            a.setName("A");
            a.start();
            Thread.sleep(5000);
            a.interrupt();
            System.out.println("中断了c");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
