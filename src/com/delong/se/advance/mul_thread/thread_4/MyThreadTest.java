package com.delong.se.advance.mul_thread.thread_4;

public class MyThreadTest
{
    public static void main (String[] args)
    {
        final OperateNumber operateNumber = new OperateNumber();
        final MyThread
                myThread = new MyThread(operateNumber, "AS-2189");
        myThread.start();

        final MyThread
                myThread2 = new MyThread(operateNumber, "DELONG-AS-2189");
        myThread2.start();
    }
}
