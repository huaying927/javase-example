package com.delong.se.advance.mul_thread.thread_6;

public class OperateNumber
{

    public static synchronized void test ()
    {

        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep((long) (Math.random() * 1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("线程: " + Thread.currentThread().getName() + " 运行第 " + i + "次");
        }


    }
}
