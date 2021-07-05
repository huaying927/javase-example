package com.delong.se.advance.mul_thread.switch_operate_num;

public class OperateNumber extends Object
{
    private int num = 0;

    public synchronized void increase()
    {
        while(num == 1)
        {
                try
                {
                    this.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
        }

        num++;
        System.out.println(num);
        this.notify();//唤醒：唤醒正在等待的线程，让等待的线程沿着wait之后的路径继续执行
    }

    public synchronized void decrease()
    {
        while(num == 0)
        {

            try
            {
                this.wait();//阻塞
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        num--;

        System.out.println(num);

        this.notify();
    }
}
