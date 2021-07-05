package com.delong.se.advance.mul_thread.runnable_2;

public class MyRunnable implements Runnable
{
    @Override
    public void run ()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("线程: " + Thread.currentThread().getName() + " 运行第 " + i + "次");
        }
    }
}
