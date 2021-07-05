package com.delong.se.oop;

public class SubLoadSorted extends LoadSorted
{
    public SubLoadSorted ()
    {
        System.out.println("SubLoadSorted默认构造方法");
    }

    {
        System.out.println("SubLoadSorted代码块");
    }

    static
    {
        System.out.println("SubLoadSorted静态代码块");
    }
}
