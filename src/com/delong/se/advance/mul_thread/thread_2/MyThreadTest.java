package com.delong.se.advance.mul_thread.thread_2;

public class MyThreadTest
{
    public static void main (String[] args)
    {
        final MyThread myThread = new MyThread("AS-2189");
        myThread.start();

        final MyThread myThread2 = new MyThread("DELONG-AS-2189");
        myThread2.start();
    }
}
