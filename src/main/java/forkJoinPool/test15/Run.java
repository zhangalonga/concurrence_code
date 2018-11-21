package forkJoinPool.test15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * created by zhangalong on 2018/11/21
 */
public class Run {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List list = new ArrayList();
        list.add(new MyCallable(5000));
        list.add(new MyCallable(4000));
        list.add(new MyCallable(3000));
        list.add(new MyCallable(2000));
        list.add(new MyCallable(1000));
        ForkJoinPool pool = new ForkJoinPool();
        final List<Future<String>> all = pool.invokeAll(list);
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i).get() + "nowTime:" + System.currentTimeMillis());
        }

    }
}
