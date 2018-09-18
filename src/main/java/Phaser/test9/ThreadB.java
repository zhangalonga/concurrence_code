package Phaser.test9;

/**
 * created by zhangalong on 2018/9/18
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethodA();
    }
}
