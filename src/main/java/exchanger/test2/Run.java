package exchanger.test2;

import java.util.concurrent.Exchanger;

/**
 * created by zhangalong on 2018/8/8
 */
public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ThreadA A = new ThreadA(exchanger);
        ThreadB B = new ThreadB(exchanger);
        A.start();
        B.start();
    }
}
