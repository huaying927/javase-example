package com.delong.se.oop.polym4;

public class Teacher extends Human
{
    public void teaching()
    {
        System.out.println("老师教课...");
    }

    @Override
    public void drinking()
    {
        System.out.println("老师喝水...");
    }

    public void eat()
    {
        System.out.println("老师吃饭...");
    }
}
