package forkJoinPool.test22;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/26
 */
public class MyTask2 extends RecursiveTask<Integer> {
    private int begin;
    private int end;

    public MyTask2(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        Integer sum = 0;
        if ((end - begin) > 2) {
            int mid = (end + begin) / 2;
            final MyTask2 task2 = new MyTask2(begin, mid);
            final MyTask2 myTask2 = new MyTask2(mid + 1, end);
            task2.fork();
            myTask2.fork();
            final Integer integer = task2.join();
            final Integer integer1 = myTask2.join();
            return integer + integer1;
        } else {
            int count = 0;
            for (int i = begin; i <= end; i++) {
                count = count + i;
            }
            return count;
        }
    }
}
