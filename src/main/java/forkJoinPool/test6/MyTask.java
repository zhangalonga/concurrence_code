package forkJoinPool.test6;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/20
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
        System.out.println(Thread.currentThread().getName() + "---------------");
        Integer sum = 0;
        System.out.println("compute:" + begin + " " + end);
        if ((end - begin) != 0) {
            System.out.println("!=0");
            int middle = (begin + end) / 2;
            System.out.println("left 传入的值" + (begin + " " + middle));
            final MyTask task = new MyTask(begin, middle);
            System.out.println("right 传入的值" + (middle + 1) + " " + end);
            final MyTask task1 = new MyTask(middle + 1, end);
            this.invokeAll(task, task1);
            Integer left = task.join();
            System.out.println("left的值" + left);
            Integer right = task1.join();
            System.out.println("right的值" + right);
            return left + right;
        } else {
            return end;
        }
    }
}
