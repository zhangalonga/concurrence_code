package CompletionService.Test5;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/18
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            MyCallableA a = new MyCallableA();
            MyCallableB b = new MyCallableB();
            ExecutorService pool = Executors.newSingleThreadExecutor();
            CompletionService service = new ExecutorCompletionService(pool);
            service.submit(a);
            service.submit(b);
            for (int i = 0; i < 2; i++) {
                System.out.println("zzzzz" + " " + service.take().get());
            }
            System.out.println("main end!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
