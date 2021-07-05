package com.delong.se.advance.reflect_proxy.reflection;

public class CalculationExample
{
    public void sayHi (String name)
    {
        System.out.println(name + ": 你好");
    }

    private String sayHello (String name)
    {
        return name + ": 你好";
    }

    private int sum (int num, int num2)
    {
        return num + num2;
    }
}
