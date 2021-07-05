package com.delong.se.advance.mul_thread.thread_1;

public class MyThread extends Thread
{
    @Override
    public void run ()//方法体是线程的运行状态
    {
        try
        {
            Thread.sleep(3000);//阻塞状态
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("线程: " + Thread.currentThread().getName() + " 正在运行。。。");
    }//运行完毕之后是线程的死亡状态
}
