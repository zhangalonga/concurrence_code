package CompletionService.Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/17
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            MyCallable callable1 = new MyCallable("u1", 5000);
            MyCallable callable2 = new MyCallable("u2", 4000);
            MyCallable callable3 = new MyCallable("u3", 3000);
            MyCallable callable4 = new MyCallable("u4", 2000);
            MyCallable callable5 = new MyCallable("u5", 1000);
            List<Callable> list = new ArrayList<>();
            list.add(callable1);
            list.add(callable2);
            list.add(callable3);
            list.add(callable4);
            list.add(callable5);
            final ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            final CompletionService service = new ExecutorCompletionService<>(executor);
            for (int i = 0; i < 5; i++) {
                service.submit(list.get(i));
            }
            for (int i = 0; i < 6; i++) {
                System.out.println("等待打印第" + (i + 1) + "个返回值");
            }
            System.out.println(service.take().get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
