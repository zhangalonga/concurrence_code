package future.Test2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * created by zhangalong on 2018/10/11
 */
public class Run {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("打印的信息");
            }
        };

        ExecutorService pool = Executors.newCachedThreadPool();
        Future submit = pool.submit(a);
        System.out.println(submit.get() + " " + submit.isDone());


    }
}
