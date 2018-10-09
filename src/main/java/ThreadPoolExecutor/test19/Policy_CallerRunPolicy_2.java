package ThreadPoolExecutor.test19;

/**
 * created by zhangalong on 2018/10/9
 */
public class Policy_CallerRunPolicy_2 {
    public static void main(String[] args) {
        final ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
        System.out.println("main end!");
    }
}
