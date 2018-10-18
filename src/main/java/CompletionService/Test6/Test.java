package CompletionService.Test6;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/18
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UserInfo info = new UserInfo();
        MyRunnable runnable = new MyRunnable(info);
        Executor pool = Executors.newCachedThreadPool();
        CompletionService service = new ExecutorCompletionService(pool);
        Future<UserInfo> future = service.submit(runnable, info);
        System.out.println(future.get().getUserName() + "  " + future.get().getPassword());
    }
}
