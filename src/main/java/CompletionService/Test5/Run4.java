package CompletionService.Test5;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/18
 */
public class Run4 {
    public static void main(String[] args) throws InterruptedException {
        MyCallableA a = new MyCallableA();
        MyCallableB b = new MyCallableB();
        ExecutorService pool = Executors.newSingleThreadExecutor();
        CompletionService service = new ExecutorCompletionService(pool);
        service.submit(a);
        service.submit(b);
        for (int i = 0; i < 2; i++) {
            System.out.println("zzzzz" + " " + service.poll());
        }
        Thread.sleep(6000);
        System.out.println("A处" + "" + service.poll());
        System.out.println("B处" + "" + service.poll());
        System.out.println("main end");
        System.out.println("main end!");

    }
}
