package executorService.test4;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/24
 */
public class MyCallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MycallableB begin" + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallabelB" + (i + 1));
        }
        System.out.println("MyCallableB end" + System.currentTimeMillis());
        if (1 == 1) {
            System.out.println("1==1");
            throw new Exception("报错了BBB");
        }
        return "returnB";
    }
}
