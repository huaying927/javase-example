package com.delong.se.advance.mul_thread.runnable_4;

/**
 * 演示的多线程执行的有序性，加锁(synchronized),在某一时刻只能有一个对象访问类中加锁的方法 ，
 * 如果类中还有其他的加锁方法, 那么只要某个对象不释放掉已经被调用的加锁方法 ，
 * 则其他的加锁方法照样不能被访问
 */
public class MyRunnableTest
{
    public static void main (String[] args)
    {
        final OperateNumber operateNumber = new OperateNumber();

        final MyRunnable myRunnable = new MyRunnable(operateNumber);
        final Thread thread = new Thread(myRunnable, "AS-2189");
        thread.start();

        final Thread thread2 = new Thread(myRunnable, "DELONG-2189");
        thread2.start();
    }
}
