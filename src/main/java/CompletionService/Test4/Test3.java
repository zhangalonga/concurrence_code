package CompletionService.Test4;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/18
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallableA a = new MyCallableA();
        MyCallableB b = new MyCallableB();
        ExecutorService pool = Executors.newCachedThreadPool();
        CompletionService service = new ExecutorCompletionService(pool);
        service.submit(a);
        service.submit(b);
        System.out.println("zzzzz" + " " + service.poll(4, TimeUnit.SECONDS) + " " + System.currentTimeMillis());
        System.out.println("x");
        System.out.println("zzzzz" + " " + service.poll(2, TimeUnit.SECONDS).get() + " " + System.currentTimeMillis());
        System.out.println("x");
        System.out.println("zzzzz" + " " + service.poll(5, TimeUnit.SECONDS).get() + " " + System.currentTimeMillis());
        System.out.println("x");
        System.out.println("main end");
    }
}
