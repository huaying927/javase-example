package com.delong.se.advance.mul_thread.thread_5;

public class OperateNumber
{

    public void test()
    {
        System.out.println("\"test...\" = " + "test...");
        //synchronized(同步)块:在任意时刻，
        // 只能有其中一个线程中的对象访问该方法
        synchronized(this)
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
}
