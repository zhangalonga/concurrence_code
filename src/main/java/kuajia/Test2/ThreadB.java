package kuajia.Test2;

/**
 * created by zhangalong on 2018/12/3
 */
public class ThreadB extends Thread {
    private MyService2 service2;

    public ThreadB(MyService2 service2) {
        this.service2 = service2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            service2.map.put("ThreadB" + (i + 1), "ThreadB" + i + 1);
            System.out.println("ThreadB" + (i + 1));
        }
    }
}
