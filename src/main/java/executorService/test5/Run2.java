package executorService.test5;

import executorService.test2.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * created by zhangalong on 2018/10/24
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            List list = new ArrayList();
            list.add(new MyCallableB());
            ExecutorService service = Executors.newCachedThreadPool();
            String value = (String) service.invokeAny(list, 1, TimeUnit.SECONDS);
            System.out.println("value=====================" + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("mainA");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("mainB");
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("mainC");
        }
    }
}
