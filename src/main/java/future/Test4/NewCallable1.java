package future.Test4;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/12
 */
public class NewCallable1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            while (1 == 1) {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "100-100";
    }
}
