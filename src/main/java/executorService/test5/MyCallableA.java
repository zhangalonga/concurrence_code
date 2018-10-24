package executorService.test5;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/24
 */
public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MyCallable A begin" + System.currentTimeMillis());
        for (int i = 0; i < 193456; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallabel A i = " + (i + 1));
        }
        System.out.println("MyCallable A end" + System.currentTimeMillis());
        return "MyCallable A";
    }
}
