package com.delong.se.advance.mul_thread.thread_3;

public class OperateNumber
{
    public void test()
    {
        int count = 0;
        for (int i = 1; i <= 5; i++)
        {
            try
            {
                Thread.sleep((long)(Math.random()*1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("线程: " + Thread.currentThread().getName() + " 运行第 "  + ++count + "次");
        }
    }
}