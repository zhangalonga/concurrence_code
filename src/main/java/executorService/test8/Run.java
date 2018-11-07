package executorService.test8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * created by zhangalong on 2018/11/7
 */
public class Run {
    public static void main(String[] args) {
        try {
            List list = new ArrayList();
            list.add(new MyCallableA());
            list.add(new MyCallableB());
            ExecutorService service = Executors.newCachedThreadPool();
            System.out.println("Y=" + System.currentTimeMillis());
            List<Future<String>> futures;
            futures = service.invokeAll(list);
            System.out.println("Z=" + System.currentTimeMillis());
            for (int i = 0; i < futures.size(); i++) {
                System.out.println("result=" + futures.get(i).get());
            }
            System.out.println("main end");
        } catch (InterruptedException e) {
            System.out.println("报错了InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("报错了ExecutionException");
            e.printStackTrace();
        }
    }
}
