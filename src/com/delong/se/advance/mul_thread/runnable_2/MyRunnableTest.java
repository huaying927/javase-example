package com.delong.se.advance.mul_thread.runnable_2;

/**
 * 演示的多线程执行的无序性
 */
public class MyRunnableTest
{
    public static void main (String[] args)
    {
        final MyRunnable myRunnable = new MyRunnable();
        final Thread thread = new Thread(myRunnable, "AS-2189");
        thread.start();

        final Thread thread2 = new Thread(myRunnable, "DELONG-2189");
        thread2.start();
    }
}
