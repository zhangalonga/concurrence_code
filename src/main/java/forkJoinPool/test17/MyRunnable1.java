package forkJoinPool.test17;

/**
 * created by zhangalong on 2018/11/22
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String s = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                if (Thread.currentThread().isInterrupted() == true) {
                    System.out.println("任务未完成，中断了");

                    throw new InterruptedException();

                }
            }
            System.out.println("任务完成了");
        } catch (InterruptedException e) {
            System.out.println("进入catch中断任务");
            e.printStackTrace();
        }
    }
}
