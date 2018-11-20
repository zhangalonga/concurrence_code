package forkJoinPool.test2;

import java.util.concurrent.RecursiveAction;

/**
 * created by zhangalong on 2018/11/20
 */
public class MyRecursiveAction extends RecursiveAction {

    private int begin;
    private int end;

    public MyRecursiveAction(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected void compute() {
        System.out.println(Thread.currentThread().getName() + " ");
        if (end - begin > 2) {
            int middle = (begin + end) / 2;
            final MyRecursiveAction action = new MyRecursiveAction(begin, middle);
            final MyRecursiveAction action1 = new MyRecursiveAction(middle + 1, end);
            this.invokeAll(action, action1);
        } else {
            System.out.println("打印组合为：" + begin + " - " + end);
        }

    }
}
