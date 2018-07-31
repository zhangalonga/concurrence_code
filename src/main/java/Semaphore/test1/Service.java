package Semaphore.test1;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/7/31
 */
public class Service {
    //定义最多一个线程来执行acquire()和release()的代码，3个线程是同步的
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        try{
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"end time="+System.currentTimeMillis());
            semaphore.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
