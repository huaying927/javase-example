package com.delong.se.advance.mul_thread.thread_1;

public class MyThreadTest
{
    public static void main (String[] args)
    {
        final MyThread myThread = new MyThread();//线程的创建状态
        System.out.println("myThread.getState() = " + myThread.getState().ordinal());

//        myThread.setName("AS-2189");
        myThread.start();//线程的就绪状态(只有从就绪状态才能进入到运行状态)
    }
}
