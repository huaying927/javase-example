package com.delong.se.oop.singleton;

public class SingletonTest
{
    public static void main (String[] args)
    {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance == instance2);
    }
}
