package Semaphore.test14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * created by zhangalong on 2018/8/7
 */
public class ListPool {
    private int poolMaxSize = 3;
    private int semaphorePermits = 5;
    private List<String> list = new ArrayList<>();
    private Semaphore semaphore = new Semaphore(semaphorePermits);
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public ListPool() {
        super();
        for (int i = 0; i < poolMaxSize; i++) {
            list.add("张阿龙" + (i + 1));
        }
    }

    public String get() {
        String getString = null;
        try {
            semaphore.acquire();
            lock.lock();
            while (list.size() == 0) {
                condition.await();
            }
            getString = list.remove(0);
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getString;
    }

    public void put(String stringValue) {
        lock.lock();
        list.add(stringValue);
        condition.signalAll();
        lock.unlock();
        semaphore.release();

    }


}
