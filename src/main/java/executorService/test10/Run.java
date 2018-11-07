package executorService.test10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/11/7
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyCallableA a = new MyCallableA();
            MyCallableB b = new MyCallableB();
            List list = new ArrayList();
            list.add(a);
            list.add(b);
            ExecutorService service = Executors.newCachedThreadPool();
            System.out.println("X==" + System.currentTimeMillis());
            List<Future<String>> futures;
            futures = service.invokeAll(list, 2, TimeUnit.SECONDS);
            System.out.println("Y==" + System.currentTimeMillis());
            for (int i = 0; i < futures.size(); i++) {
                System.out.println("for第" + (i + 1) + "次循环");
                System.out.println(futures.get(i).get());
            }
            System.out.println("Z==" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println("报错了InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("报错了ExecutionException");
            e.printStackTrace();
        }
    }
}
