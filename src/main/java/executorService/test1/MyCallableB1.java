package executorService.test1;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/19
 */
public class MyCallableB1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB1 begin" + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableB1" + (i + 1));
        }
        System.out.println("MyCallableB1 end" + System.currentTimeMillis());
        return "returnB1";
    }
}
