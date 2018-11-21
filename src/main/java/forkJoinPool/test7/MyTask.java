package forkJoinPool.test7;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/21
 */
public class MyTask extends RecursiveTask<Integer> {

    private int begin;
    private int end;


    public MyTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
        System.out.println("#" + (begin + " " + end));
    }

    @Override
    protected Integer compute() {
        Integer sum = 0;
        System.out.println("compute=" + begin + " " + end);
        if ((end - begin) > 2) {
            System.out.println("!=0");
            int mid = (begin + end) / 2;
            System.out.println("left传入的值" + (begin + " " + mid));
            final MyTask task = new MyTask(begin, mid);
            System.out.println("right传入的值" + ((mid + 1) + " " + end));
            final MyTask task1 = new MyTask(mid + 1, end);
            this.invokeAll(task, task1);
            Integer left = task.join();
            Integer right = task1.join();
            return left + right;
        } else {
            int count = 0;
            for (int i = begin; i <= end; i++) {
                count = count + i;
            }
            return count;
        }
    }
}
