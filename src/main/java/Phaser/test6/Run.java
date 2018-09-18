package Phaser.test6;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/18
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(10);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
    }
}
