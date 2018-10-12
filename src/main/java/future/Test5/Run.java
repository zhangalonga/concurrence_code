package future.Test5;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/12
 */
public class Run {
    public static void main(String[] args) {
        try {
            final MyCallable callable = new MyCallable();
            final ThreadPoolExecutor executor =
                    new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            final Future<String> future = executor.submit(callable);
            System.out.println("返回值" + future.get(5, TimeUnit.SECONDS));
            System.out.println("end time" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println("进入了InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("进入了ExecutionException");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("进入了TimeoutException");
            e.printStackTrace();
        }
    }
}
