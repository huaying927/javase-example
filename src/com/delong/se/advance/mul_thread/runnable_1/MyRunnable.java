package com.delong.se.advance.mul_thread.runnable_1;

public class MyRunnable implements Runnable
{
    @Override
    public void run ()
    {
        System.out.println("Runnable线程: " + Thread.currentThread().getName() + " 正在运行。。。");
    }
}
