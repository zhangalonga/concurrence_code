package executorService.test3;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/19
 */
public class MyCallableA1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            System.out.println("MyCallableA" + Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
            for (int i = 0; i < 123456; i++) {
                String s = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                System.out.println("MycallableA在运行中=" + (i + 1));
            }
            if (1 == 1) {
                System.out.println("xxxxx==中断了");
                throw new NullPointerException();
            }
            System.out.println("MyCallableA" + Thread.currentThread().getName() + "end" + System.currentTimeMillis());

        } catch (Exception e) {
            System.out.println(e.getMessage() + "左边就是捕获的异常信息");
        }

        return "returnA";
    }
}
