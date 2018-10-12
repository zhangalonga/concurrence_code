package future.Test6;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/12
 */
public class MyCallable implements Callable<String> {
    private String number;

    public MyCallable(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        Integer.parseInt("a");
        return number;
    }
}
