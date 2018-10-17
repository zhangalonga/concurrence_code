package CompletionService.Test3;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/17
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        CompletionService service = new ExecutorCompletionService(pool);
        for (int i = 0; i < 1; i++) {
            service.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(3000);
                    System.out.println("3秒过去了");
                    return "3s";
                }
            });
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(service.poll());
        }


    }
}
