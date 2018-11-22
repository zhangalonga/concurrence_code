package forkJoinPool.test17;

/**
 * created by zhangalong on 2018/11/22
 */
public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println("任务成功完成!");
    }
}
