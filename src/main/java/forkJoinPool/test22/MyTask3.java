package forkJoinPool.test22;


import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/27
 */
public class MyTask3 extends RecursiveTask<Integer> {
    private int begin;
    private int end;

    public MyTask3(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        Integer sum = 0;
        if ((end - begin) > 2) {
            int mid = (begin + end) / 2;
            final MyTask3 task3 = new MyTask3(begin, mid);
            final MyTask3 myTask3 = new MyTask3(mid + 1, end);
            this.invokeAll(task3, myTask3);
            return task3.join() + myTask3.join();
        } else {
            int count = 0;
            for (int i = begin; i <= end; i++) {
                count = count + i;
            }
            return count;
        }
    }
}
