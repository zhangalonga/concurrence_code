package Semaphore.test14;

/**
 * created by zhangalong on 2018/8/7
 */
public class ThreadA extends Thread {
    private ListPool listPool;

    public ThreadA(ListPool listPool) {
        this.listPool = listPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String getString = listPool.get();
            System.out.println(Thread.currentThread().getName() + "取得值" + getString);
            listPool.put(getString);
        }
    }
}
