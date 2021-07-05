package com.delong.se.advance.mul_thread.runnable_1;

public class MyRunnableTest
{
    public static void main (String[] args)
    {
        final MyRunnable myRunnable = new MyRunnable();
        final Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
