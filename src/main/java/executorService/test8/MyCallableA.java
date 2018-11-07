package executorService.test8;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/11/7
 */
public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin" + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableA" + (i + 1));
        }
        System.out.println("MyCallableA end" + System.currentTimeMillis());
        if (1 == 1) {
            System.out.println("A报错了");
            throw new Exception("出现异常");
        }
        return "returnA";
    }
}
