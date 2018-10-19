package executorService.test2;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/19
 */
public class MyCallableC implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            System.out.println("MyCallableC" + Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
            for (int i = 0; i < 193456; i++) {
                String s = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                System.out.println("MyCallableC在运行中=" + (i + 1));
            }
            if (1 == 1) {
                System.out.println("xxxxxxx=中断了");
                throw new NullPointerException();
            }
            System.out.println("MyCallableC" + Thread.currentThread().getName() + "end" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "通过显示try——catch捕捉异常了");
            throw e;
        }
        return "returnC";

    }
}
