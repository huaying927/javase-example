package com.delong.se.advance.mul_thread.thread_4;

public class OperateNumber
{
    //synchronized(同步):在任意时刻，
    // 只能有其中一个线程中的对象访问该方法
    public synchronized void test()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep((long)(Math.random()*1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("线程: " + Thread.currentThread().getName() + " 运行第 "  + i + "次");
        }
    }
}
