package com.delong.se.advance.mul_thread.runnable_5;

public class MyRunnable implements Runnable
{
    private OperateNumber operateNumber;

    public MyRunnable (OperateNumber operateNumber)
    {
        this.operateNumber = operateNumber;
    }

    @Override
    public void run ()
    {
       this.operateNumber.test();
    }
}
