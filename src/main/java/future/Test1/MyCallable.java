package future.Test1;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/11
 */
public class MyCallable implements Callable<String> {
    private int age;

    public MyCallable(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(8000);
        return "返回的年龄值是：" + age;
    }
}
