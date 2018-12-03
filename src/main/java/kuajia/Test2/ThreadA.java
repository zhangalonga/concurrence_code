package kuajia.Test2;

/**
 * created by zhangalong on 2018/12/3
 */
public class ThreadA extends Thread {
    private MyService2 service2;

    public ThreadA(MyService2 service2) {
        this.service2 = service2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            service2.map.put("ThreadA" + (i + 1), "ThreadA" + i + 1);
            System.out.println("ThreadA" + (i + 1));
        }
    }
}
