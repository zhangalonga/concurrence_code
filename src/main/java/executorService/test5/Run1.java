package executorService.test5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/24
 */
public class Run1 {
    public static void main(String[] args) {

        try {
            MyCallableA a = new MyCallableA();
            List list = new ArrayList();
            list.add(a);
            ExecutorService service = Executors.newCachedThreadPool();
            String value = (String) service.invokeAny(list, 1, TimeUnit.SECONDS);
            System.out.println("value==" + value);
            System.out.println("zzzzzzz");
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
