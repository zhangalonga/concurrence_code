package ThreadPoolExecutor.test9;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * created by zhangalong on 2018/9/26
 */
public class Test9 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnableB a1 = new MyRunnableB("A1");
        MyRunnableB a2 = new MyRunnableB("A2");
        MyRunnableB a3 = new MyRunnableB("A3");
        MyRunnableB a4 = new MyRunnableB("A4");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, 30, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(a1);
        executor.execute(a2);
        executor.execute(a3);
        executor.execute(a4);
        Thread.sleep(1000);
        List<Runnable> now = executor.shutdownNow();
        for (int i = 0; i < now.size(); i++) {
            MyRunnableB runnable = (MyRunnableB) now.get(i);
            System.out.println(runnable.getUserName() + "任务被取消！");
        }
        System.out.println("main end!");
    }
}
