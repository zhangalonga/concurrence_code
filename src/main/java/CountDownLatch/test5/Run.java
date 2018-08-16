package CountDownLatch.test5;

/**
 * created by zhangalong on 2018/8/16
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA[] threadAS = new ThreadA[3];
        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i] = new ThreadA(service);
        }
        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i].start();
        }
    }
}
