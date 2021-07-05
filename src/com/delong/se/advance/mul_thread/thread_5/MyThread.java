package com.delong.se.advance.mul_thread.thread_5;

public class MyThread extends Thread
{
    private OperateNumber on;

    public MyThread (OperateNumber on, String name)
    {
        super(name);
        this.on = on;
    }

    @Override
    public void run ()//方法体是线程的运行状态
    {
        on.test();
    }
}
