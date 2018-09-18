package Phaser.test7;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/18
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(7);
        ThreadA[] threadA = new ThreadA[5];
        for (int i = 0; i < threadA.length; i++) {
            threadA[i] = new ThreadA(phaser);
            threadA[i].setName("Thread" + (i + 1));
            threadA[i].start();
        }
        Thread.sleep(2000);
        System.out.println("已到达：" + phaser.getArrivedParties());
        System.out.println("未到达：" + phaser.getUnarrivedParties());
    }
}
