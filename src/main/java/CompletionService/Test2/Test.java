package CompletionService.Test2;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/17
 */
public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService pool = Executors.newCachedThreadPool();
        CompletionService service = new ExecutorCompletionService(pool);
        for (int i = 0; i < 10; i++) {
            service.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    long value = (int) (Math.random() * 1000);
                    System.out.println("sleep=" + value + " " + Thread.currentThread().getName());
                    Thread.sleep(value);
                    return "wdqdq" + value + " " + Thread.currentThread().getName();
                }
            });
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(service.take().get());
        }
    }
}
