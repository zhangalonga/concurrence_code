package CompletionService.Test4;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/18
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallableA a = new MyCallableA();
        MyCallableB b = new MyCallableB();
        ExecutorService pool = Executors.newCachedThreadPool();
        CompletionService service = new ExecutorCompletionService(pool);
        service.submit(a);
        service.submit(b);
        for (int i = 0; i < 2; i++) {
            System.out.println("zzzz" + " " + service.poll(6, TimeUnit.SECONDS).get());
            System.out.println("x");
        }
        System.out.println("main end");
    }
}
