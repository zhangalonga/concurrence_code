package Phaser.test4;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/17
 */
public class MyService {
    private Phaser phaser;

    public MyService(Phaser phaser) {
        this.phaser = phaser;
    }

    public void testMethod() {

        try {
            System.out.println("A begin ThreadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("B")) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("A end ThreadName=" + Thread.currentThread().getName() + "end phase value=" + phaser.getPhase() + " " + System.currentTimeMillis());
            System.out.println("B begin ThreadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("B")) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("B end ThreadName=" + Thread.currentThread().getName() + "end phase value=" + phaser.getPhase() + " " + System.currentTimeMillis());
            System.out.println("C begin ThreadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("B")) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("C end ThreadName=" + Thread.currentThread().getName() + "end phase value=" + phaser.getPhase() + " " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
