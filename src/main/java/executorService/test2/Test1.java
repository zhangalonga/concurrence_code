package executorService.test2;

import executorService.test1.MyCallableA;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/10/19
 */
public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List list = new ArrayList();
        list.add(new MyCallableA());
        list.add(new MyCallableC());
        ExecutorService service = Executors.newCachedThreadPool();
        String v = (String) service.invokeAny(list);
        System.out.println("zzzz" + v);
    }
}
