package com.delong.se.advance.mul_thread.thread_2;

public class MyThread extends Thread
{
    public MyThread (String name)
    {
        super(name);
    }

    @Override
    public void run ()//方法体是线程的运行状态
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("线程: " + this.getName() + " 运行第 "  + i + "次");
        }
    }
}
