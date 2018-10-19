package executorService.test3;

import executorService.test1.MyCallableA;
import executorService.test2.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/10/19
 */
public class Test {
    public static void main(String[] args) {

        try {
            List list = new ArrayList();
            list.add(new MyCallableB());
            //list.add(new MyCallableA());
            list.add(new MyCallableA1());
            ExecutorService service = Executors.newCachedThreadPool();
            String v = null;
            v = (String) service.invokeAny(list);
            System.out.println("main取得的返回值" + v);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("ExecutionException");
            e.printStackTrace();
        }

    }
}
