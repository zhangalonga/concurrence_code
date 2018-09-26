package ThreadPoolExecutor.test9;

/**
 * created by zhangalong on 2018/9/26
 */
public class Runnable1 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String s = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                if (Thread.currentThread().isInterrupted() == true) {
                    System.out.println("任务没有完成，就中断了");
                }
                throw new InterruptedException();
            }
            System.out.println("任务完成了");
        } catch (InterruptedException e) {
            System.out.println("进入catch中断了任务");
            e.printStackTrace();
        }

    }
}
