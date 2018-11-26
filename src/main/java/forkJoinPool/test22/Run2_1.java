package forkJoinPool.test22;

import java.util.concurrent.ForkJoinPool;

/**
 * created by zhangalong on 2018/11/26
 */
public class Run2_1 {
    public static void main(String[] args) {
        final MyTask2 task2 = new MyTask2(1, 900000);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(task2);
        do {
            System.out.println("并行数" + pool.getParallelism() + "线程池大小" + pool.getPoolSize() +
                    "获得活的线程数" + pool.getActiveThreadCount() +
                    "获得任务的总个数" + pool.getQueuedTaskCount() +
                    "获取偷窃的任务个数" + pool.getStealCount() +
                    "获取正在运行并且不再阻塞状态下的线程个数" + pool.getRunningThreadCount() +
                    "取得已经提交尚未执行的任务" + pool.getQueuedSubmissionCount());
        } while (!task2.isDone());
    }
}
