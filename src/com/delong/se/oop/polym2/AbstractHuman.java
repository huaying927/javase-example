package com.delong.se.oop.polym2;

/**
 * abstract class
 *
 */
public abstract class AbstractHuman implements IHuman
{
    public abstract void drinking();

    public void  running()
    {
        System.out.println("abstract human中running  method");
    }

    @Override
    public void jumping ()
    {
        System.out.println("抽象类中重写接口中的跳的方法 ");
    }
}
