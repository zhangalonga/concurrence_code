package Phaser.test4;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/18
 */
public class Run1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println(" protected boolean onAdvance(int phase, int registeredParties) 被调用");
                return false;
            }

            ;
        };

        MyService myService = new MyService(phaser);
        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(myService);
        c.setName("C");
        c.start();

    }
}
