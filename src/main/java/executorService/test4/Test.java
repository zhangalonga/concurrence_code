package executorService.test4;

import executorService.test1.MyCallableA;
import executorService.test2.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/10/24
 */
public class Test {
    public static void main(String[] args) {

        try {
            List list = new ArrayList();
            list.add(new MyCallableA());
            list.add(new MyCallableB());
            ExecutorService service = Executors.newCachedThreadPool();
            System.out.println(service);
            String any = null;
            any = (String) service.invokeAny(list);
            System.out.println("返回值" + any);
            System.out.println("mainend");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("进入了 InterruptedException");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("进入了ExecutionException");
        }
    }
}
