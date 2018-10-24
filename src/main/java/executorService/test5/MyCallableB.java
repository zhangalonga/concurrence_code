package executorService.test5;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/24
 */
public class MyCallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            System.out.println("MyCallableB" + Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
            for (int i = 0; i < 193456; i++) {
                String s = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                System.out.println("MyCallableB 在运行中" + (i + 1));
            }
            if (Thread.currentThread().isInterrupted() == true) {
                System.out.println("xxxxx中断了");
                throw new NullPointerException();
            }
            System.out.println("MyCallableB" + Thread.currentThread().getName() + "end" + System.currentTimeMillis());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "通过显示Try-catch捕捉了异常");
            throw e;
        }
        return "returnB";
    }
}
