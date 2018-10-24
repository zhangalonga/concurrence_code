package executorService.test4;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/24
 */
public class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MycallableA begin" + System.currentTimeMillis());
        for (int i = 0; i < 123; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallabelA" + (i + 1));
        }
        System.out.println("MyCallableA end" + System.currentTimeMillis());
        if (1 == 1) {
            System.out.println("1==1");
            throw new Exception("报错了AAAA");
        }
        return "returnA";
    }
}
