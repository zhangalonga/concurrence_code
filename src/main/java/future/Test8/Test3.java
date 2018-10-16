package future.Test8;

import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/16
 */
public class Test3 {
    public static void main(String[] args) {

        try {
            ThreadPoolExecutor executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            Future<String> future = executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Integer.parseInt("a");
                    return "我是返回值";
                }
            });
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("能捕获异常");
        }
    }
}
