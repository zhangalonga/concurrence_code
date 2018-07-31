package Semaphore.test2;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/7/31
 */
public class Service {

    private Semaphore semaphore = new Semaphore(2);

    public void testMethod(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"end time="+System.currentTimeMillis());


        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
