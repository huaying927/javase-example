package com.delong.se.advance.mul_thread.switch_operate_num;

public class IncreaseNumberThread extends Thread
{
    private OperateNumber operateNumber;

    public IncreaseNumberThread (OperateNumber operateNumber)
    {
        this.operateNumber = operateNumber;
    }

    @Override
    public void run ()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep((long) (Math.random() * 1000 + 1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            this.operateNumber.increase();
        }
    }
}
