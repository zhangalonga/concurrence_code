package future.Test6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * created by zhangalong on 2018/10/12
 */
public class Test {
    public static void main(String[] args) {

        try {
            final MyCallable callable = new MyCallable("1");
            final ExecutorService service = Executors.newCachedThreadPool();
            final Future<String> future = service.submit(callable);
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("里面出错了");
            e.printStackTrace();
        }
    }
}
