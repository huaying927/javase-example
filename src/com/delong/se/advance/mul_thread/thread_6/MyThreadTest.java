package com.delong.se.advance.mul_thread.thread_6;

public class MyThreadTest
{
    public static void main (String[] args)
    {
        final OperateNumber operateNumber = new OperateNumber();
        final MyThread
                myThread = new MyThread(operateNumber, "AS-2189");
        myThread.start();
        final OperateNumber operateNumber2 = new OperateNumber();
        final MyThread
                myThread2 = new MyThread(operateNumber2, "DELONG-AS-2189");
        myThread2.start();
    }
}
