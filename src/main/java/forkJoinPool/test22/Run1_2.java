package forkJoinPool.test22;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/26
 */
public class Run1_2 {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = null;
        ForkJoinPool pool = new ForkJoinPool();
        for (int i = 0; i < 50; i++) {
            task = new MyTask();
            pool.submit(task);
        }
        Thread.sleep(50);
        System.out.println("并行数" + pool.getParallelism() + "线程池大小" + pool.getPoolSize() + "取得已经提交尚未执行的任务" + pool.getQueuedSubmissionCount() +
                "判断队列中是否有未执行的任务" + pool.hasQueuedSubmissions());
        do {

        } while (!task.isDone());
    }
}
