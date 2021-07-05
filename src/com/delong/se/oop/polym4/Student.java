package com.delong.se.oop.polym4;

public class Student extends Human
{
    public void leaning()
    {
        System.out.println("学生学习...");
    }

    @Override
    public void drinking()
    {
        System.out.println("学生喝水。。。");
    }

    public void eat()
    {
        System.out.println("学生吃饭...");
    }
}
