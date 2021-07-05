package com.delong.se.advance.mul_thread.switch_operate_num;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * JUC中重入锁的写法
 */
public class OperateNumber2
{
    private int num;

    private final Lock lock = new ReentrantLock();

    private final Condition incrCond = lock.newCondition();

    private final Condition decrCond = lock.newCondition();


    public void increase ()
    {
        lock.lock();
        lock.lock();
        try
        {

            while (this.num == 1)
            {
                try
                {
                    incrCond.await();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

            num++;

            System.out.println(num);

            decrCond.signal();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
            lock.unlock();
        }

    }

    public void decrease ()
    {
        lock.lock();
        try
        {
            while (this.num == 0)
            {
                try
                {
                    decrCond.await();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

            num--;

            System.out.println(num);

            incrCond.signal();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }
}
