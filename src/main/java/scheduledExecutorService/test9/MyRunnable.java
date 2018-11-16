package scheduledExecutorService.test9;


/**
 * created by zhangalong on 2018/11/16
 */
public class MyRunnable implements Runnable {
    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (Thread.currentThread().isInterrupted() == true) {
                    throw new InterruptedException();
                }
                System.out.println("run!username=" + username + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("中断了");
        }


    }
}
