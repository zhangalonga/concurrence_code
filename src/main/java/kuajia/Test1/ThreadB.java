package kuajia.Test1;

/**
 * created by zhangalong on 2018/12/3
 */
public class ThreadB extends Thread {
    private MyService1 service1;

    public ThreadB(MyService1 service1) {
        this.service1 = service1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            service1.map.put("ThreadB" + (i + 1), "ThreadB" + i + 1);
            System.out.println("ThreadB" + (i + 1));
        }
    }
}
