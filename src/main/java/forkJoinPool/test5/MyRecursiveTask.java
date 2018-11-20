package forkJoinPool.test5;

import java.util.concurrent.RecursiveTask;

/**
 * created by zhangalong on 2018/11/20
 */
public class MyRecursiveTask extends RecursiveTask<String> {
    private int begin;
    private int end;

    public MyRecursiveTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected String compute() {
        System.out.println(Thread.currentThread().getName() + "------------");
        if (end - begin > 2) {
            int middle = (begin + end) / 2;
            final MyRecursiveTask task = new MyRecursiveTask(begin, middle);
            final MyRecursiveTask task1 = new MyRecursiveTask(middle + 1, end);
            this.invokeAll(task, task1);
            return task.join() + task1.join();
        } else {
            String s = "";
            for (int i = begin; i <= end; i++) {
                s = s + (i);
            }
            System.out.println("else返回：" + s + " " + begin + " " + end);
            return s;
        }
    }
}
