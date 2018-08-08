package exchanger.test1;

import java.util.concurrent.Exchanger;

/**
 * created by zhangalong on 2018/8/8
 */
public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ThreadA a = new ThreadA(exchanger);
        a.start();
        System.out.println("main end");
    }
}
