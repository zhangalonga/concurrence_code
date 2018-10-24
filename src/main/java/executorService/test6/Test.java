package executorService.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * created by zhangalong on 2018/10/24
 */
public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CallableA a = new CallableA();
        CallableB b = new CallableB();
        List list = new ArrayList();
        list.add(a);
        list.add(b);
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println("invokeAll begin" + System.currentTimeMillis());
        List<Future> all = service.invokeAll(list);
        System.out.println("invokeAll end" + System.currentTimeMillis());
        for (int i = 0; i < all.size(); i++) {
            System.out.println("返回的结果=" + all.get(i).get() + " " + System.currentTimeMillis());
        }

    }
}
