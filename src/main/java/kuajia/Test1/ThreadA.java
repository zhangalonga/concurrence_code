package kuajia.Test1;

/**
 * created by zhangalong on 2018/11/29
 */
public class ThreadA extends Thread {
    private MyService1 myService1;

    public ThreadA(MyService1 myService1) {
        this.myService1 = myService1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            myService1.map.put("ThreadA" + (i + 1), "ThreadA" + i + 1);
            System.out.println("ThreadA" + (i + 1));
        }
    }
}
