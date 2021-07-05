package com.delong.se.advance.mul_thread.switch_operate_num;

public class OperateNumberTest
{
    public static void main (String[] args)
    {
        final OperateNumber operateNumber = new OperateNumber();

        final IncreaseNumberThread it1 = new IncreaseNumberThread(operateNumber);
        final IncreaseNumberThread it2 = new IncreaseNumberThread(operateNumber);

        final DecreaseNumberThread dt1 = new DecreaseNumberThread(operateNumber);
        final DecreaseNumberThread dt2 = new DecreaseNumberThread(operateNumber);

        it1.start();
        it2.start();
        dt1.start();
        dt2.start();


    }
}
