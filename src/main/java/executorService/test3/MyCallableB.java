package executorService.test3;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/19
 */
public class MyCallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB" + Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
        for (int i = 0; i < 193456; i++) {
            String s = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableB在运行中=" + (i + 1));
        }
        System.out.println("MyCallableB" + Thread.currentThread().getName() + "end" + System.currentTimeMillis());
        return "returnB";
    }
}
