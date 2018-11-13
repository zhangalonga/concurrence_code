package scheduledExecutorService.test1;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/11/13
 */
public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            System.out.println("calla begin" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("calla end  " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "retuanA";
    }
}
