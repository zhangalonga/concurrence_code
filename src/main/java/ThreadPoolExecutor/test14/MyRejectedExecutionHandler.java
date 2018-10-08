package ThreadPoolExecutor.test14;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * created by zhangalong on 2018/10/8
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(((MyRunnable1) r).getUserName() + "被拒绝执行");
    }
}
