package Phaser.test9;

/**
 * created by zhangalong on 2018/9/18
 */
public class ThreadC extends Thread {
    private MyService myService;

    public ThreadC(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethodB();
    }
}
