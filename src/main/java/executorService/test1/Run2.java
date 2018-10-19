package executorService.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/10/19
 */
public class Run2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List list = new ArrayList();
        list.add(new MyCallableA());
        list.add(new MyCallableB2());
        ExecutorService service = Executors.newCachedThreadPool();
        String any = (String) service.invokeAny(list);
        System.out.println("zzzz" + any);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    }
}
