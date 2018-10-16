package future.Test9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/16
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable("1", 5000);
        MyCallable callable2 = new MyCallable("2", 4000);
        MyCallable callable3 = new MyCallable("3", 3000);
        MyCallable callable4 = new MyCallable("4", 2000);
        MyCallable callable5 = new MyCallable("5", 1000);
        List<Callable> list = new ArrayList<>();
        list.add(callable);
        list.add(callable2);
        list.add(callable3);
        list.add(callable4);
        list.add(callable5);
        List<Future> list1 = new ArrayList<>();
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        for (int i = 0; i < 5; i++) {
            list1.add(executor.submit(list.get(i)));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list1.get(i).get() + "  " + System.currentTimeMillis());
        }


    }
}
